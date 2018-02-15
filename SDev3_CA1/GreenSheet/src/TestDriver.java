/* TestDriver
 *
 * @Author: Chuong Trung Vuong
 * @Date  : Nov 20, 2015
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDriver 
{
    public static void main(String[] args)
    {
        MotorRace gp = new MotorRace("Brazil", "Grand Prix");
        File inFile = new File("files/data.txt");
        
        String name;
        String country;
        double prize1;
        double prize2;
        double prize3;
        
        try (Scanner in = new Scanner(inFile))
        {
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                Scanner fullLine = new Scanner(line);
                fullLine.useDelimiter(",");
                while (fullLine.hasNext())
                {
                    name = fullLine.next();
                    country = fullLine.next();
                    prize1 = Double.parseDouble(fullLine.next());
                    prize2 = Double.parseDouble(fullLine.next());
                    prize3 = Double.parseDouble(fullLine.next());
                    gp.addDriver(gp.new Driver(name, country, prize1, prize2, prize3));
                }
            }
            System.out.println(gp);
            System.out.print(gp.calculateHighestEarner());
            System.out.printf("The total prize money paid out is: €%,.2f%n%n", 
                                gp.calcTotalPrizeMoney());
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }        
    } // end main
} // end class TestDriver