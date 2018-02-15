package cax00111602;
import java.util.*;
import java.io.*;


public class Test {
    
    public static void main(String[] args) throws IOException {
        String name = null;
        String country = null;
        double prize1;
        double prize2;
        double prize3;
        
        MotorRace gp = new MotorRace("Brazil","Grand Prix");
        
        File myFile = new File("files/data.txt");
        
        try(Scanner in = new Scanner(myFile)){
            while(in.hasNextLine()){
                
                String line = in.nextLine();
                
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                
                while(lineScanner.hasNext()){
                    
                    name = lineScanner.next();
                    country = lineScanner.next();
                    prize1 = Double.parseDouble(lineScanner.next());
                    prize2 = Double.parseDouble(lineScanner.next());
                    prize3 = Double.parseDouble(lineScanner.next());
                    MotorRace.Driver d = gp.new Driver(name, country, prize1, prize2, prize3);
                }               
            }            
            System.out.println(gp);
            System.out.println(gp.calculateHighestEarner());          
            System.out.printf("The total prize money paid out is: €%,.2f%n%n", gp.calcTotalPrizeMoney());    
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex);
        }   
        
        
        
    }
    
}
