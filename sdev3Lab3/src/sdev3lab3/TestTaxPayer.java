package sdev3lab3;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author x00111602
 */
public class TestTaxPayer {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        
        
        //Sets up 2 Arrays
        int []rsiArray;
        double []salaryArray;
        
        //AskUser to enter the number of taxpayers
        System.out.println("Please enter the number of taxpayers: ");
        rsiArray = new int[in.nextInt()];
        
        salaryArray = new double[rsiArray.length];
        
        //Taxpayer Array
        TaxPayer[] taxpayer = new TaxPayer[rsiArray.length];
        
        
        
        for (int i = 0; i<rsiArray.length; i++){
        System.out.println("Please enter the rsi number for tax payer "+(i+1)+": ");
        rsiArray[i] = in.nextInt();
        
        System.out.println("Please enter the salary for tax payer "+(i+1)+": ");
        salaryArray[i] = in.nextDouble();
        
        taxpayer[i] = new TaxPayer (rsiArray[i], salaryArray[i]);
        }
        
        for(int i = 0; i<rsiArray.length; i++){
            System.out.println("RSI Number: "+rsiArray[i]);
            System.out.println("Gross Salary: "+defaultFormat.format(salaryArray[i]));
        }
        
    }
    
}
