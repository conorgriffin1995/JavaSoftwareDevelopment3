

package Surface;


public abstract class Material {
    
    private String nameOfMaterial;
    private double pricePerUnit;
    
    //CONSTRUCTOR
    public Material(String nameOfMaterialIn,double PPUIn)
    {
        nameOfMaterial = nameOfMaterialIn;
        pricePerUnit = PPUIn;
    }
    
    //GETTER
    public String getNameOfMaterial()
    {
        return nameOfMaterial;
    }
    
    public double getPricePerUnit()
    {
        return pricePerUnit;
    }
    
    public abstract double getReqMaterial(Surface s1);
    
    public double calcTotalPrice(Surface s2)
    {
        double total;
        
        total = pricePerUnit*getReqMaterial(s2);
        
        return total;
    }

    int compareTo(Material m2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
