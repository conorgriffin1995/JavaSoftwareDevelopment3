package sdev3lab4;

/**
 *
 * @Conor Griffin x00111602
 */
public class Circle extends Shape {
    
    protected double radius;
    
    
    public Circle(double radiusIn, String colourIn, String typeIn){
        
        super(colourIn, typeIn);
        radius = radiusIn;      
        
    }
    
    public void print(){
        
        super.print();
        System.out.println("The radius of the shape is: "+radius);
        
    }
    
    public double calcArea(){
        
        area = Math.PI*radius*radius;
        System.out.println("The area of the shape is: "+area);
        
        return area;
        
    }
    
    
}
