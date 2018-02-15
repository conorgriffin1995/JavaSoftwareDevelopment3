package sdev3lab15.Exercise3;

import java.io.*;
import java.util.*;

public class TestPolymorphism {

    public static void main(String[] args) throws IOException{
        ArrayList<Material> materials = new ArrayList<>();

        // Call the readMaterialsFile method here
        readMaterialsFile(materials);
        
       
        
        
        Surface aSurface = new Surface("testSurface", 5.7, 5.7);
 

        for (int i = 0; i < materials.size(); i++) {
            String name = materials.get(i).getName();
            double req = materials.get(i).getMaterialReq(aSurface);
            double price = materials.get(i).calcTotalPrice(aSurface);
            System.out.println("Name: " + name + ", Requirement: "
                    + String.format("%.2f",req) + " units, Price €" + String.format("%,.2f",price));
            System.out.println();
        }
        
        
    }
     // Write the code for the readMaterialsFile method here
    public static void readMaterialsFile(ArrayList<Material> materials) throws IOException {
        String flag;
        String name;
        int coats;
        double price;
        double noOfSqMPerLitre;
        double lengthPerRoll;
        double widthPerRoll;
        double coverage;
        
        File myFile = new File ("Files/materials.txt");
        
        try (Scanner in = new Scanner(myFile))
        {
            while(in.hasNextLine())
            {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                
                    while(lineScanner.hasNext())
                    {

                    flag = lineScanner.next();

                    switch (flag)
                    {
                        case "p": name = lineScanner.next();
                                  price = Double.parseDouble(lineScanner.next());
                                  coats = Integer.parseInt(lineScanner.next());
                                  noOfSqMPerLitre = Double.parseDouble(lineScanner.next());
                                  materials.add(new Paint(name, price, coats, noOfSqMPerLitre));
                            break;

                        case "w": name = lineScanner.next();
                                  price = Double.parseDouble(lineScanner.next());
                                  lengthPerRoll = Double.parseDouble(lineScanner.next());
                                  widthPerRoll  = Double.parseDouble(lineScanner.next());
                                  materials.add(new Wallpaper(name, price, lengthPerRoll, widthPerRoll));
                            break;

                        case "f": name = lineScanner.next();
                                  price = Double.parseDouble(lineScanner.next());
                                  coverage = Double.parseDouble(lineScanner.next());
                                  materials.add(new Flooring(name, price, coverage));
                            break;
                        
                    }
                    
                    }

                
                
            }
        }

    }
    
    
    
    
    
}
