package example3;

import java.io.*;

public class EOFDemo {

    public static void main(String[] args) throws IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("files/numbers.dat"))) {
            int number;
            System.out.println("Reading numbers in numbers.dat");
            try {
                while (true) {
                    number = inputStream.readInt();
                    System.out.println(number);
                }
            } catch (EOFException e) {
                System.out.println("No more numbers in the file.");
            }
        }
    }
}


