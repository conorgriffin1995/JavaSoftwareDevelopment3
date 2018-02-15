package example5;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) throws IOException {

        String[] lnames = new String[40];
        String[] fnames = new String[40];
        String[] test = new String[40];
        int[] ages = new int[40];
        int i = 0;
        ArrayList<Employee> persons = new ArrayList<>();

        File inFile = new File("files", "employees.txt");
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                test[i] = in.nextLine();
                String[] temp = test[i].split(",");

                lnames[i] = temp[0];
                fnames[i] = temp[1];
                ages[i] = Integer.parseInt(temp[2]);

                persons.add(new Employee(lnames[i], fnames[i], ages[i]));
            }
        }

        for (int j = 0; j < persons.size(); j++) {
            System.out.println(persons.get(j));
        }
    }
}

