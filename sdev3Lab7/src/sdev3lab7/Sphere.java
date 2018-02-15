package sdev3lab7;

/**
 *
 * @author x00111602
 */
public class Sphere extends ThreeDShape {
    
    public Sphere(int xIn, int yIn, int radius){
        
        super(xIn, yIn, radius, radius, radius);
        
    }
    public String getName(){
        return "Sphere";
    }
    
    public int getRadius(){
        return getLength();
    }
    
    public int getArea(){
        
        double area = 4 * Math.PI * (getLength() * getLength());
        int a = (int) area;
        return a;  
        
    }
    
    public int getVolume(){
        
        double surfaceArea = 4.0/3.0 * Math.PI * (getLength() * getHeight() * getWidth());
        int v = (int) surfaceArea;
        return v; 
        
    }
    
    public String toString(){

        return super.toString() + " radius: "+getLength();
        
    }
}
