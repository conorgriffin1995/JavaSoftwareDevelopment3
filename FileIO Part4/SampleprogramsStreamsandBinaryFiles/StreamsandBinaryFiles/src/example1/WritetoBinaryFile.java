package example1;

import java.io.*;

public class WritetoBinaryFile {

    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("files/numbers.dat"))) {
            int i;
            for (i = 0; i < 5; i++) {
                outputStream.writeInt(i);
            }

            System.out.println("Numbers written to the file numbers.dat.");
        }
    }
}
