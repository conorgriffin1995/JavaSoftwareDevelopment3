package example1;

import java.io.*;

public class SerializeCar {

    private final String FILENAME = "files/cars.dat";

    private void write() throws FileNotFoundException, IOException {
        Car c1 = new Car("11D 16999", "Ford Galaxy", "Blue");
        Car c2 = new Car("11D 16123", "Opel Corsa", "Silver");
        try (FileOutputStream fo = new FileOutputStream(FILENAME);
                ObjectOutputStream oo = new ObjectOutputStream(
                        new BufferedOutputStream(fo))) {
            oo.writeObject(c1);
            System.out.println("Car written:\t" + c1);
            oo.writeObject(c2);
            System.out.println("Car written:\t" + c2);
        }
    }

    private void read() throws IOException, ClassNotFoundException {
        Car c;
        try (ObjectInputStream oi = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(FILENAME)))) {

            try {
                while (true) {
                    c = (Car) oi.readObject();
                    System.out.println("Car read:\t" + c);
                }
            } catch (EOFException e) {
                System.out.println("EOF reached");
            }

        }
    }

    public static void main(String args[]) throws IOException, 
            ClassNotFoundException {
        SerializeCar c = new SerializeCar();
        c.write();
        c.read();
    }
}


