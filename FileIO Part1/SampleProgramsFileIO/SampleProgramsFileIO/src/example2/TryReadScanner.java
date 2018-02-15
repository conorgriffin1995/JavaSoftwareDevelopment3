package example2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryReadScanner {

    public static void main(String[] args) throws IOException  {
        int next, sum = 0;
        File inFile = new File("files", "data.txt");
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextInt()) {
                next = in.nextInt();
                sum = sum + next;
            }
        }
        System.out.println("The sum of the numbers is:" + sum);
    }
}
