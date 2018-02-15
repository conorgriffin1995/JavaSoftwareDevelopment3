/* MotorRace
 *
 * @Author: Chuong Trung Vuong
 * @Date  : Nov 20, 2015
 */
import java.util.ArrayList;

public class MotorRace 
{
    private String location;
    private String competition;
    private ArrayList<Driver> drivers;

    public MotorRace(String location, String competition) 
    {
        this.location = location;
        this.competition = competition;
        drivers = new ArrayList<>();
    }
    
    public void addDriver(Driver driver)
    {
        drivers.add(driver);
    }
    
    public String calculateHighestEarner()
    {        
        String name = "";
        String country = "";
        double highestAverage = Double.MIN_VALUE;
        
        for (Driver driver : drivers)
        {
            double tempHighest = driver.calcAvgPrizeMoney();
            if (tempHighest > highestAverage)
            {
                name = driver.name;
                country = driver.country;
                highestAverage = tempHighest;
            }           
        }
        return String.format("The highest earner: %s from %s with average prize money of: €%,.2f%n", 
                                name, country, highestAverage);
    }
    
    @Override
    public String toString()
    {
        String s = String.format("Race Location: %s \t Competition: %s%n%n", location, competition);
        for (Driver driver : drivers)
        {
            s += driver.toString();
        }
        return s;
    }
    
    public double calcTotalPrizeMoney()
    {
        double total = 0;
        for (Driver driver : drivers)
        {
            for (int i = 0; i < driver.prizeMoney.length; i++)
            {
                total += driver.prizeMoney[i];
            }
        }
        return total;
    }
    
    // ************************************************************************************
    // INNER CLASS
    class Driver
    {
        private String name;
        private String country;
        private double[] prizeMoney = new double[3]; // hold 3 as told

        public Driver(String name, String country, double prize1, double prize2, double prize3) 
        {
            this.name = name;
            this.country = country;
            // 3 different, so loop does not really good choice
            prizeMoney[0] = prize1;
            prizeMoney[1] = prize2;
            prizeMoney[2] = prize3;
        }
        
        public double calcAvgPrizeMoney()
        {
            double total = 0;
            for (int i = 0; i < prizeMoney.length; i++)
            {
                total += prizeMoney[i];
            }
            return total / prizeMoney.length;
        }
        
        @Override
        public String toString()
        {
            String s = String.format("Driver Name: %s%n", name);
            s += String.format("Country    : %s%n", country);
            for (int i = 0; i < prizeMoney.length; i++)
            {
                s += String.format("Prize Money %d: €%,.2f    ", (i+1), prizeMoney[i]);
            }
            s += "\n\n";
            return s;
        }
    } // end class Driver
} // end class MotorRace