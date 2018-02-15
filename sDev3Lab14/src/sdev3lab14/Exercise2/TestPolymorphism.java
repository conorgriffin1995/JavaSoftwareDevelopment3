package sdev3lab14.Exercise2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class TestPolymorphism {
    
    
    

    public static void main(String[] args) throws IOException {
        DecimalFormat f = new DecimalFormat("#,###.##");
        ArrayList<Material> materials = new ArrayList<>();
        
        fillPaint(materials);
        fillWallpaper(materials);
        fillFlooring(materials);

        Surface aSurface = new Surface("testSurface", 5.7, 5.7);

        for (int i = 0; i < materials.size(); i++) {
            String name = materials.get(i).getName();
            double req = materials.get(i).getMaterialReq(aSurface);
            double price = materials.get(i).calcTotalPrice(aSurface);
            System.out.println("Name: " + name + ", Requirement: "
                    + f.format(req) + " units, Price €" + f.format(price));
            System.out.println();
        }
        
  
        
    }
    
    public static void fillPaint(ArrayList<Material> materials) throws IOException{
        
        
        String name;
        double price;
        int coats;
        double noOfSqMPerLitre;
        
        
        File myDir = new File ("Files");
        File myFile = new File (myDir, "paint.txt");
        try(Scanner in = new Scanner(myFile)){
            
            while(in.hasNext()){
                
               name = in.nextLine();
               price = Double.parseDouble(in.nextLine());
               coats = Integer.parseInt(in.nextLine());
               noOfSqMPerLitre = Double.parseDouble(in.nextLine());
               materials.add(new Paint(name, price, coats, noOfSqMPerLitre));
                
            }
            
        }
        
        
        
    }
    
    public static void fillWallpaper(ArrayList<Material> materials) throws IOException{
        
        String name;
        double price;
        double lengthPerRoll;
        double widthPerRoll;
        
        File myDir = new File ("Files");
        File myFile = new File (myDir, "wallpaper.txt");
        
        try(Scanner in = new Scanner(myFile)){
            
            while(in.hasNext()){
                
               name = in.nextLine();
               price = Double.parseDouble(in.nextLine());
               lengthPerRoll = Double.parseDouble(in.nextLine());
               widthPerRoll  = Double.parseDouble(in.nextLine());
               materials.add(new Wallpaper(name, price, lengthPerRoll, widthPerRoll));
                
            }
            
        }
        
        
        
    }
    
    public static void fillFlooring(ArrayList<Material> materials) throws IOException{
        
        String name;
        double price;
        double coverage;
        
        File myDir = new File ("Files");
        File myFile = new File (myDir, "flooring.txt");   
        
        try(Scanner in = new Scanner(myFile)){
            
            while(in.hasNext()){
                
               name = in.nextLine();
               price = Double.parseDouble(in.nextLine());
               coverage = Double.parseDouble(in.nextLine());
               materials.add(new Flooring(name, price, coverage));
               
            }
            
        } 
        
    }
}
