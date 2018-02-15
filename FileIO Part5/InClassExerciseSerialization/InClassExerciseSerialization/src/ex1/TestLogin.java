package ex1;

import java.io.*;

class TestLogin {

    private final String FILENAME = "files/login.dat";// write a login

    private void write() throws FileNotFoundException, IOException {
        Login c1 = new Login("user1", "pass1");
        Login c2 = new Login("user2", "pass2");
        try (FileOutputStream fo = new FileOutputStream(FILENAME);
                ObjectOutputStream oo = new ObjectOutputStream(
                        new BufferedOutputStream(fo))) {
            oo.writeObject(c1);
            System.out.println("Login written:\t" + c1);
            oo.writeObject(c2);
            System.out.println("Login written:\t" + c2);
        }
    }

    private void read() throws IOException, ClassNotFoundException {
        Login l;
        try (ObjectInputStream oi = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(FILENAME)))) {

            try {
                while (true) {
                    l = (Login) oi.readObject();
                    System.out.println("Login read:\t" + l);
                }
            } catch (EOFException e) {
                System.out.println("EOF reached");

            }
          
        }
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        TestLogin t = new TestLogin();
        t.write();
        t.read();
    }
}
