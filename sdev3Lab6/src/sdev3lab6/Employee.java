package sdev3lab6;

/**
 *
 * @author x00111602
 */
public class Employee extends StaffMember 
{
    
    private String rsiNumber;
    protected double rateOfPay;
    
    public Employee(String nameIn, String addressIn, String phoneNumIn, String rsiNumberIn, double rateOfPayIn)
    {
        super(nameIn,addressIn,phoneNumIn);
        rsiNumber = rsiNumberIn;
        rateOfPay = rateOfPayIn;
    }
    
    public String getRsi()
    {
        return rsiNumber;
    }
    
    public String toString()
    {
        return super.toString() + "\nRSI Number : "+rsiNumber;
        
    }
    
    public double pay()
    {
        return rateOfPay;
    }
    
}
