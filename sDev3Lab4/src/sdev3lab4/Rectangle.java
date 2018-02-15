package sdev3lab4;

/**
 *
 * @Conor Griffin x00111602
 */
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double lengthIn, double widthIn, String colourIn, String typeIn){
        
        super(colourIn, typeIn);
        length = lengthIn;
        width = widthIn;
        
        
    }
    
    public void print(){
        super.print();
        System.out.println("The length of the shape is: "+length);
        System.out.println("The width of the shape is: "+width);
    }
    
    public double calcArea(){
        
        area = length * width;
        System.out.println("The area of the shape is: "+area);
        
        return area;
 
    }
    
    
    
    
}
