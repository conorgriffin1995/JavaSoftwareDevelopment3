package sdev3lab7;

/**
 *
 * @ConorGriffin x00111602
 */
public class Circle extends TwoDShape {
    
    public Circle(int xIn, int yIn, int radius){
        
        super(xIn, yIn, radius, radius);
        
    }
    
    public String getName(){
        return "Circle";
    }
    
    public int getRadius(){
        return getOneD();
    }
    
    public int getArea(){
        
        double area = Math.PI * getOneD() * getTwoD();
        int i = (int) area;
        return i;        
        
    }
    
    public String toString(){

        return super.toString() + " radius: "+getOneD() ;
        
    }
    
}
