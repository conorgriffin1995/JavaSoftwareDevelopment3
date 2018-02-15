

package Surface;


public class Paint extends Material {
    
    private double numCoats;
    private double coverage;
    
    //CONSTRUCTOR
    public Paint(String nameOfMaterialIn,double PPUIn, double numCoatsIn, double coverageIn)
    {
        super(nameOfMaterialIn, PPUIn);
        numCoats = numCoatsIn;
        coverage = coverageIn;
    }

    public double getNumCoats()
    {
        return numCoats;
    }

    public double getCoverage()
    {
        return coverage;
    }

    public double getReqMaterial(Surface s1)
    {
        double totalPaint;
        final double WINDOW = .80;
        totalPaint = (s1.calcArea()*4);
        totalPaint *= WINDOW;
        totalPaint *= numCoats;
        totalPaint /= coverage;
        return totalPaint;      
        
    }
    
    
    
}
