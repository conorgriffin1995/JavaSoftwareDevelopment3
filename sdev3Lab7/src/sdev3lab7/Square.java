package sdev3lab7;

/**
 *
 * @ConorGriffin x00111602
 */
public class Square extends TwoDShape {
    
    public Square(int xIn, int yIn, int sideIn){
        
        super(xIn, yIn, sideIn, sideIn);
        
    }
    
    public String getName(){
        
        return "Square";
        
    }
    
    public double getSide(){
        
        return getSide();
        
    }
    
    public int getArea(){
        
        double area = getOneD() * getTwoD();
        int i = (int) area;
        return i;
        
    }
    
    public String toString(){
        /*String s = "\nSide: "+getOneD();
        s += toString();
        return s;*/
        return super.toString() + " side: "+getOneD();
    }
    
}
