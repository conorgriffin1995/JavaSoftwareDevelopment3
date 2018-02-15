package sdev3lab6;

/**
 *
 * @Conor Griffin x00111602
 */
public class Hourly extends Employee
{
    
    private int hoursWorked;
    
    public Hourly(String nameIn, String addressIn, String phoneNumIn, String rsiNumberIn, double payIn)
    {
        super(nameIn,addressIn,phoneNumIn,rsiNumberIn,payIn);
        hoursWorked = 0;
    }
    
    public void addHours(int hoursWorkedIn)
    {
        hoursWorked = hoursWorkedIn;
    }
    
    public double pay()
    {
        return rateOfPay * hoursWorked;
    } 
    
    public String toString()
    {
        return super.toString() + "\nCurrent Hours : "+hoursWorked;
       
    } 
    
}
