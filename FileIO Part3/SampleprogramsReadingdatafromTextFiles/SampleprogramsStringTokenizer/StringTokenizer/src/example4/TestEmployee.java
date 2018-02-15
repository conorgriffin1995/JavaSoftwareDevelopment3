package example4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) throws IOException {
        String lName = null, fName = null;
        int age = 0;
        ArrayList<Employee> persons = new ArrayList<>();

        File inFile = new File("files", "employees.txt");
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    fName = lineScanner.next();
                    lName = lineScanner.next();
                    age = Integer.parseInt(lineScanner.next());

                }
                persons.add(new Employee(fName, lName, age));
            }
        }

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}


