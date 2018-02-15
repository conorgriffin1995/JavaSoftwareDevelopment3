package sdev3lab7;

/**
 *
 * @author x00111602
 */
public class Paint {
    
    private double coverage;
    private double totalPaint = 0;
    
    
    public Paint(double coverageIn){
        
        coverage = coverageIn;
        
    }
    public double calcAmount(Shape shapeIn)
    {
        double amount = 0;
        if (shapeIn instanceof TwoDShape)
        {
            TwoDShape two = (TwoDShape) shapeIn;
            amount = two.getArea()/coverage;
        }
        if (shapeIn instanceof ThreeDShape)
        {
            ThreeDShape three = (ThreeDShape) shapeIn;
            amount = three.getArea()/coverage;
        }
        
        return amount;
    }
    
   
}
