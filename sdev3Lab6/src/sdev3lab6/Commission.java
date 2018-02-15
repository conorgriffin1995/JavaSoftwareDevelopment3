package sdev3lab6;

/**
 *
 * @Conor Griffin x00111602
 */
public class Commission extends Hourly {
    
    private double totalSales;
    private double comRate;
    private double commission;
    
    public Commission(String nameIn, String addressIn, String phoneNumIn, String rsiNumberIn, double rateOfPayIn, double comRateIn)
    {
        super(nameIn,addressIn,phoneNumIn,rsiNumberIn,rateOfPayIn);
        totalSales = 0.0;
    }
    
    public void addSales(double totalSalesIn)
    {
        totalSales = totalSalesIn;
        
    }
    
    public double pay(){
        
        return totalSales * comRate;
 
    }
    
    public String toString()
    {
        return super.toString() + "\nTotal Sales: " + totalSales;
       
    }
    
}
