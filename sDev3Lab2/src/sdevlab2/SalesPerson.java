package sdevlab2;

/**
 *
 * @author x00111602
 */
public class SalesPerson extends Employee{
    
    private double sales[];
    
    public SalesPerson(String nameIn, int YearsOfServiceIn, double salaryIn, int numOfDays){
        
        super(nameIn, YearsOfServiceIn, salaryIn);
        double [] sales = new double [numOfDays];
        
        
    }
    public void fillSales(int dayNum, double amountOfSale){
        
        for(int i = 0; i < sales.length; i++){
            if (dayNum == sales[i+1])
            {
                sales[i] = amountOfSale;
            }
        }
        
    }
    public void report(){
        super.report();
        
        //Total
        double total = 0;
        double minSales = 0;
        double maxSales = 0;
        int noSale = 0;
        
        for(int i = 0; i < sales.length; i++){
            total += sales[i+1];
           
        //Minimum
        if (sales[i] < minSales)
        {
            minSales = sales[i];
        }
        //Maximum
        if (sales[i] > maxSales)
        {
            maxSales = sales[i];
        }
        //Number Of Days With No Sales
        if (sales[i]==0)
        {
            noSale++;
        }
            
      }
        
        System.out.println("Total Sales: "+total);
        System.out.println("Minimum Sales: "+minSales);
        System.out.println("Maximum Sales: "+maxSales);
        System.out.println("Number Of Days With No Sales: "+minSales);
    }
}
