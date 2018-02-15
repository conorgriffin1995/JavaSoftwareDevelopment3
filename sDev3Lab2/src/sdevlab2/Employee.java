package sdevlab2;
import java.text.NumberFormat;
/**
 *
 * @author x00111602
 */
public class Employee {
    
    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
    
    private String name;
    private int YearsOfService;
    private double salary;
    
    public Employee(){
        
        name = "";
        YearsOfService = 0;
        salary = 0.00;
        
    }
    public Employee(String nameIn, int YearsOfServiceIn, double salaryIn){
        
        name = nameIn;
        YearsOfService = YearsOfServiceIn;
        salary = salaryIn;
        
    }
    public void report(){
        System.out.println("Employee: "+name);
        System.out.println("    Name: "+name);
        System.out.println("    Years Service: "+YearsOfService);
        System.out.println("    Salary: "+defaultFormat.format(salary));
    }
    
    
}
