package sdev3lab7;

/**
 *
 * @ConorGriffin x00111602
 */
public abstract class TwoDShape extends Shape{
    
    private int oneD;
    private int twoD;
    
    public TwoDShape(int xIn, int yIn, int oneDIn, int twoDIn){
        
        super(xIn, yIn);
        oneD = oneDIn;
        twoD = twoDIn;
        
    }
    public int getOneD(){
        return oneD;
    }
    public int getTwoD(){
        return twoD;
    }
    
    public abstract int getArea();
        
    
}
