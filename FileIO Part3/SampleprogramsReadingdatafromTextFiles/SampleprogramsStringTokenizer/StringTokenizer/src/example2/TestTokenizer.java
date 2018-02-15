package example2;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestTokenizer {

    public static void main(String[] args) throws IOException {
        String lName=null,fName=null;
        int age=0;
        File inFile = new File("files", "employees.txt");
        try (Scanner in = new Scanner(inFile)) {

            StringTokenizer wordFinder;
            while (in.hasNextLine()) {
                wordFinder = new StringTokenizer(in.nextLine(), ",");
                while (wordFinder.hasMoreTokens()) {
                    lName = wordFinder.nextToken();
                    fName = wordFinder.nextToken();
                    age = Integer.parseInt(wordFinder.nextToken());
                }
                   System.out.println(lName+" " +fName+" "+age);
            }
        }
    }
}

