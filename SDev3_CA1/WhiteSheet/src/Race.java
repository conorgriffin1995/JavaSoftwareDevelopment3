/* Race
 *
 * @Author: Chuong Trung Vuong
 * @Date  : Nov 20, 2015
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Race 
{
    private int distance;
    private String competition;
    private ArrayList<Athlete> athletes;

    public Race(int distance, String competition) 
    {
        this.distance = distance;
        this.competition = competition;
        athletes = new ArrayList<>();
        addRunner();
    }
    
    public void addRunner()
    {
        File inFile = new File("files/data.txt");
        String name;
        String country;
        double time1;
        double time2;
        double time3;
        
        try (Scanner in = new Scanner(inFile))
        {
            StringTokenizer word;
            while (in.hasNextLine())
            {
                word = new StringTokenizer(in.nextLine(), ",");
                while (word.hasMoreTokens())
                {
                    name = word.nextToken();
                    country = word.nextToken();
                    time1 = Double.parseDouble(word.nextToken());
                    time2 = Double.parseDouble(word.nextToken());
                    time3 = Double.parseDouble(word.nextToken());
                    athletes.add(new Athlete(name, country, time1, time2, time3));
                }             
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
    } // end addRunner
    
    public String calculateFavourite()
    {
        String name = "";
        String country = "";
        double lowestAverage = Double.MAX_VALUE;
        
        for (Athlete athlete : athletes)
        {
            double tempLowest = athlete.calcAverage();
            if (tempLowest < lowestAverage)
            {
                name = athlete.name;
                country = athlete.country;
                lowestAverage = tempLowest;
            }
        }
        return String.format("The favourite for race is: %s from %s Average Time: %.2f%n", 
                                name, country, lowestAverage);
    }
    
    @Override
    public String toString()
    {
        String s = String.format("Race: %s \t Distance: %d%n%n", competition, distance);
        for (Athlete athlete : athletes)
        {
            s += athlete.toString();
            s += String.format("Average Race Time: %.2f%n%n", athlete.calcAverage());
        }
        return s;
    }
    // *********************************************************************************
    // INNER CLASS
    class Athlete
    {
        private String name;
        private String country;
        private double[] times = new double[3]; // hold 3 as told

        public Athlete(String name, String country, double time1, double time2, double time3) 
        {
            this.name = name;
            this.country = country;
            // 3 different, so loop does not really good choice
            times[0] = time1;
            times[1] = time2;
            times[2] = time3;
        }
        
        public double calcAverage()
        {
            double total = 0;
            for (int i = 0; i < times.length; i++)
            {
                total += times[i];
            }
            return total / times.length;
        }
        
        @Override
        public String toString()
        {
            String s = String.format("Athlete Name: %s%n", name);
            s += String.format("Country     : %s%n", country);
            for (int i = 0; i < times.length; i++)
            {
                s += String.format("Time%d: %.1f    ", (i+1), times[i]);
            }
            s += "\n";
            return s;
        }        
    } // end class Athlete
} // end class Race