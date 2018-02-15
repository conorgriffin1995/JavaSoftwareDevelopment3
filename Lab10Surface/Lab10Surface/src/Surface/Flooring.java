

package Surface;


public class Flooring extends Material {
    
    private double coveragePP;
    
    //CONSTRUCTOR
    public Flooring(String nameOfMaterialIn,double PPUIn, double coverageIn)
    {
        super(nameOfMaterialIn, PPUIn);
        coveragePP = coverageIn;
    }

    public double getCoveragePP() {
        return coveragePP;
    }

    public double getReqMaterial(Surface s1)
    { 
        return s1.calcArea()/coveragePP;
    }
    
}
