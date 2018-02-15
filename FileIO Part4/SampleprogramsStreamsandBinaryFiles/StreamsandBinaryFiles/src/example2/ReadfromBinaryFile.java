package example2;

import java.io.*;

public class ReadfromBinaryFile {

    public static void main(String[] args) throws IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("files/numbers.dat"))) {

            System.out.println("Reading the file numbers.dat.");
            for (int i = 0; i < 5; i++) {
                System.out.println(inputStream.readInt());
            }
        }
        System.out.println("End of program.");
    }
}
