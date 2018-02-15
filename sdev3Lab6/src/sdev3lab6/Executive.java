package sdev3lab6;

/**
 *
 * @Conor Griffin x00111602
 */
public class Executive extends Employee
{
    
    private double bonus;
    
    public Executive(String nameIn, String addressIn, String phoneNumIn, String rsiNumberIn, double rateOfPayIn)
    {
        super (nameIn,addressIn,phoneNumIn,rsiNumberIn,rateOfPayIn);
        bonus = 0.0;
    }
    
    public void awardBonus(double bonusAmount)
    {    
        bonus += bonusAmount;  
    }
    public double pay()
    {
        return super.pay() + bonus;   
    }
    
}
