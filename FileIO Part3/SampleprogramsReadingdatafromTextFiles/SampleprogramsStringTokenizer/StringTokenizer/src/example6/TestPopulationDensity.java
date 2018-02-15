package example6;

import java.io.*;
import java.util.Scanner;

public class TestPopulationDensity {

    public static void main(String[] args) throws IOException {
        try (Scanner in1 = new Scanner(new File("files/worldpop.txt"));
                Scanner in2 = new Scanner(new File("files/worldarea.txt"));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("files/worlddensity.txt")))) {
            // Read lines from each file
            while (in1.hasNextLine() && in2.hasNextLine()) {
                CountryValue population = new CountryValue(in1.nextLine());
                CountryValue area = new CountryValue(in2.nextLine());

                // Compute and print the population density
                double density = 0;
                if (area.getValue() != 0) // Protect against division by zero
                {
                    density = population.getValue() / area.getValue();
                }
                out.printf("%-40s%15.2f\n", population.getCountry(), density);
            }

        }
    }
}
