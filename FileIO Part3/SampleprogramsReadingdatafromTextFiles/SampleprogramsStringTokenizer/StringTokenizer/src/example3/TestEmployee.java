package example3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestEmployee {

    public static void main(String[] args) throws IOException {
        String lName = null, fName = null;
        int age = 0;
        ArrayList<Employee> persons = new ArrayList<>();

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

                persons.add(new Employee(fName, lName, age));
            }
        }

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}


