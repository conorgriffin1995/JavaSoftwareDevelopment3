package sdevlab2;
import java.util.Scanner;
/**
 *
 * @author x00111602
 */
public class TestSales {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String name;
        int YearsOfService;
        double salary;
        int numOfDaysSales = 0;
        
        System.out.println("Please enter the name of the sales person: ");
        name = in.nextLine();
        System.out.println("Please enter the number of years service for " +name);
        YearsOfService = in.nextInt();
        System.out.println("Please enter the salary for " +name);
        salary = in.nextDouble();
        System.out.println("Please enter the number of days sales for " +name);
        numOfDaysSales = in.nextInt();
        
        SalesPerson S1 = new SalesPerson(name, YearsOfService, salary, numOfDaysSales);
        for (int i = 0; i < numOfDaysSales; i++){
            System.out.println("Enter the sales for day: "+(i+1));
            S1.fillSales(i, salary);
        }
        
        
        
    }
    
}
