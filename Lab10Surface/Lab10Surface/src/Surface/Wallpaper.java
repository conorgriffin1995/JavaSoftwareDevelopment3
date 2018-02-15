

package Surface;


public class Wallpaper extends Material{
    
    private double lengthPR;
    private double widthPR;
    
    
    //CONSTRUCTOR
    public Wallpaper(String nameOfMaterialIn,double PPUIn, double lengthIn, double widthIn)
    {
        super(nameOfMaterialIn, PPUIn);
        lengthPR = lengthIn;
        widthPR = widthIn;
    }

    public double getLengthPR() {
        return lengthPR;
    }

    public double getWidthPR() {
        return widthPR;
    }
    
    public double getReqMaterial(Surface s1)
    {
        double totalWall;
        final double WINDOW = .80;
        totalWall = (s1.calcArea()*4);
        totalWall *= WINDOW;
        totalWall /= lengthPR;
        totalWall /= widthPR;
        return totalWall;   
    }
    
}   
