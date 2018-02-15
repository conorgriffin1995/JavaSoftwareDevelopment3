package sdev3lab4;

/**
 *
 * @Conor Griffin x00111602
 */
public abstract class Shape {
    protected String type;
    private String colour;
    protected double area;
    
    public Shape(){
        type = "";
        colour = "";
        area = 0.0;
        
    }
    public Shape(String colourIn, String typeIn){
        
        colour = colourIn;
        type = typeIn;
        area = 0.0;
        
    }
    public void print(){
        
     
        System.out.println("The type of shape is: "+type);
        System.out.println("The colour of the shape is: "+colour);
        
        
    }
    public abstract double calcArea();
   
    
}


