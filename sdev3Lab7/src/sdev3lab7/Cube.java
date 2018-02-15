package sdev3lab7;

/**
 *
 * @author x00111602
 */
public class Cube extends ThreeDShape {
    
    public Cube(int xIn, int yIn, int sideIn){
        
        super(xIn, yIn, sideIn, sideIn, sideIn);
        
    }
    
    public String getName(){
        return "Cube";
    }
    
    public int getSide(){
        return getLength();
    }
    
    public int getArea(){
        
        double area = 6 * (getLength() * getLength());
        int c = (int) area;
        return c;  
        
    }
    
    public int getVolume(){
        
        double surfaceArea = (getLength() * getLength() * getLength());
        int q = (int) surfaceArea;
        return q; 
        
    }
    
    public String toString(){
        
        /*String t = "\nThe Side is: "+getLength();
        t += toString();
        return t;*/
        return super.toString() + " side: "+getLength();
        
    }
    
}
