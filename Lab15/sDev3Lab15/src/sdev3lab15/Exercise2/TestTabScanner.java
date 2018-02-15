package sdev3lab15.Exercise2;
import java.io.*;
import java.util.*;

//Conor Griffin
//Lab 15
//Exercise2

public class TestTabScanner {
    
    public static void main(String[] args) throws IOException
    {
        String fName = null;
        String lName = null;
        int age = 0;
       
        ArrayList <Employee> persons = new ArrayList<>();
    
        File myFile = new File ("Files", "employeesTab.txt");
        
        try (Scanner in = new Scanner(myFile))
        { 
            while(in.hasNextLine())
            {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                
                while(lineScanner.hasNext())
                {
                    fName = lineScanner.next();
                    lName = lineScanner.next();
                    age = Integer.parseInt(lineScanner.next());
                    
                }
                persons.add(new Employee(fName, lName, age));               
            }   
        }
        
        for(int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i));
        }
        
    }
    
    
    
}
