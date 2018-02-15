package capractice;

//CA Practice

import java.io.*;
import java.util.*;

//Conor Griffin
//X00111602

public class TestFlight  {
    
    public static void main(String[] args) throws IOException {
    String name = null;
    int age = 0;
    int bags = 0;
    
    Flight f1 = new Flight(200, 3.5);
    
    File myFile = new File("files/data.txt");
    
    
    try (Scanner in = new Scanner(myFile)){    
        while(in.hasNextLine()){
            
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            
                while(lineScanner.hasNext()){
                    name = lineScanner.next();
                    age = Integer.parseInt(lineScanner.next());
                    bags = Integer.parseInt(lineScanner.next());                
                }
                
                Flight.Passenger p = f1.new Passenger(name, age, bags);
                f1.fillList(p);
        }
                        
        f1.print();  
        System.out.println("Number of seats available: "+f1.checkAvailability());
        System.out.println(f1.findOldestPassenger());
        
            
        
        
    }
    
        
    }
    
}
