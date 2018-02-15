package sdev3lab2;

import java.util.Scanner;

/**
 *
 * @author x00111602
 */
public class Sales {
    
    public static void main(String[] args) {
        
                final int SALESPEOPLE = 5;
		int[] sales = new int[SALESPEOPLE];
		int sum;
                double average;
                int maxSale = 0;
                int minSale = 5;
                int maximumSales;
                int minimumSales;
                

		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<sales.length; i++)
			{
				System.out.print("Enter sales for salesperson " + (i+1) + ": ");
				sales[i] = scan.nextInt();
			}
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		
		for (int i=0; i<sales.length; i++)
			{
				System.out.println(" " + (i+1) + " " + sales[i]);
				sum += sales[i];
                                
                                if (sales[i]>maxSale)
                                {
                                    maxSale = sales[i];
                                    maximumSales = i;    
                                }
                                if(sales[i]<minSale)
                                {
                                    minSale = sales[i];
                                    minimumSales = i;
                                }
			}
		System.out.println("\nTotal sales: " + sum);
                
                average = sum/sales.length;
                System.out.println("\nAverage sales: " + average);
                
                System.out.println("\nSalesperson " +(maximumSales + 1)+ " had the highest sale with : " + maxSale);
                System.out.println("\nSalesperson " +(minimumSales + 1)+ " had the lowest sale with : " + minSale);
    }
  
    
    
}



