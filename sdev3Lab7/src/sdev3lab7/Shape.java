package sdev3lab7;

/**
 *
 * @ConorGriffin x00111602
 */
public abstract class Shape {

    private int x;
    private int y;
    private static int paintCount = 0;
    
    
    public Shape(){
        
        x = 0;
        y = 0;
        
    }
    public Shape(int xIn, int yIn){
        
        x = xIn;
        y = yIn;
        paintCount++;
    }
    
    public static int getPaint(){
        return paintCount;
    }
    
    public int getX(){
       return x; 
    }
    public int getY(){
       return y; 
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
    public abstract String getName();
    
}