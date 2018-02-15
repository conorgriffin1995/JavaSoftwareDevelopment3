package sdev3lab7;

/**
 *
 * @ConorGriffin x00111602
 */
public abstract class ThreeDShape extends Shape {
    
    private int dimension1;
    private int dimension2;
    private int dimension3;
    
    public ThreeDShape(int xIn, int yIn, int dimension1In, int dimension2In, int dimension3In){
        
        super(xIn, yIn);
        dimension1 = dimension1In;
        dimension2 = dimension2In;
        dimension3 = dimension3In;
        
    }
    
    public int getLength(){
        
        return dimension1;
    }
    public int getWidth(){
        
        return dimension2;
    }
    public int getHeight(){
        
        return dimension3;
    }
    
    public abstract int getArea();
    
    public abstract int getVolume();
    
    
    
}
