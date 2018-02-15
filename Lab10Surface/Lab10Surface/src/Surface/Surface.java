

package Surface;


public class Surface {

    private String name;
    private double length;
    private double width;
    
    
    //CONSTRUCTOR
    public Surface(String nameIn, double lengthIn, double widthIn)
    {
        name = nameIn;
        length = lengthIn;
        width = widthIn;
    }
    
    //GETTERS
    public String getName()
    {
        return name;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double calcArea()
    {
        return length * width;
    }
    
}
