package sdev3lab3;
import java.text.NumberFormat;
/**
 *
 * @author x00111602
 */
public class TaxPayer {
    
    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
    

    private int rsiNumber;
    private double grossIncome;
    
    
    public TaxPayer(){
        
        rsiNumber = 0;
        grossIncome = 0.0;
        
    }
    public TaxPayer(int rsiNumberIn, double grossIncomeIn){
        
        rsiNumber = rsiNumberIn;
        grossIncome = grossIncomeIn;
        
    }
    
    public int getRsiNumber(){
        return this.rsiNumber;
    }
    public double getGrossIncome(){
        return this.grossIncome;
    }
    
    public void setRsiNumber(int newRsiNumber){
        this.rsiNumber = newRsiNumber;
        
    }
    public void setGrossIncome(double newGrossIncome){
        this.grossIncome = newGrossIncome;
        
    }
    
    
}
