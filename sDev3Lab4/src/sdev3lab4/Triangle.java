package sdev3lab4;

/**
 *
 * @Conor Griffin x00111602
 */
public class Triangle extends Shape {
    
    private double base;
    private double height;
    
    public Triangle(double baseIn, double heightIn, String colourIn, String typeIn){
        
        super(colourIn, typeIn);
        base = baseIn;
        height = heightIn;
        
    }
    public void print(){
        
        super.print();
        System.out.println("The base of the shape is: "+base);
        System.out.println("The height of the shape is: "+height);
    }
    public double calcArea(){
        
        area = 0.5*base * height;
        System.out.println("The area of the shape is: "+area);
        
        return area;
        
    }
    
    
    
}
