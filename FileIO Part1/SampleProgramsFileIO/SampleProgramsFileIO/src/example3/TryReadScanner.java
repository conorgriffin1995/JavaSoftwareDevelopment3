package example3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryReadScanner {

    public static void main(String[] args) throws IOException {

        String line;
        int count = 0;
        File inFile = new File("files", "original.txt");

        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                count++;
                System.out.println(count + " " + line);
            }
        }
    }
}
