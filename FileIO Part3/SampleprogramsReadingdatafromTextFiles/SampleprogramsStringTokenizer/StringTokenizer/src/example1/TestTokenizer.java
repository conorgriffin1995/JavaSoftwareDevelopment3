package example1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestTokenizer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line:");
        String inputLine = in.nextLine();
        StringTokenizer wordFinder;
        //the second argument is a string with 3 delimiters
        wordFinder = new StringTokenizer(inputLine, ",. ");       
        while (wordFinder.hasMoreTokens()) {
            System.out.println(wordFinder.nextToken());
        }
    }
}
