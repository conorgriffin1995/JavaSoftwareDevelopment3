package sdev3lab4;

/**
 *
 * @Conor Griffin x00111602
 */
public class Cylinder extends Circle {
    
    private double height;
    private double volume;

    public Cylinder(double heightIn, double radiusIn, String colourIn, String typeIn){
        
        super(radiusIn, colourIn, typeIn);
        height = heightIn;
        volume = 0.0;
        
    }
    public void print(){
        
        super.print();
        System.out.println("The height of the Cylinder is: "+height);
        
    }
    public double calcArea(){
        
        area = (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
        System.out.println("The surface area of the Cylinder is: "+area);
        
        return area;
        
    }
    public double calcVolume(){
        
        volume = Math.PI*radius*radius*height;
        System.out.println("The volume of the Cylinder is: "+volume);
        
        return volume;
        
    }
}
