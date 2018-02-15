package sdev3lab1;
import java.text.NumberFormat;
/**
 *
 * @author x00111602
 */

public class Employee {
    
    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

    private int empID;
    private String name;
    private String rsiNumber;
    private double salary;
    
    public Employee(){
        
        empID = 0;
        name = " ";
        rsiNumber = " ";
        salary = 0.0;
    }
    
    //Overloaded Constructor
    public Employee(int empIDIn, String nameIn, String rsiNumberIn, double salaryIn){
        
        empID = empIDIn;
        name = nameIn;
        rsiNumber = rsiNumberIn;
        salary = salaryIn;
        
    }
    
    //Getter Methods
    public int getEmpID(){
        
        return this.empID;
    }
    public String getName(){
        return this.name;
    }
    public String getRSINumber(){
        return this.rsiNumber;
    }
    public double getSalary(){
        return this.salary;
    }
    
    //Setter Methods
    public void setEmpID(int newEmpID){
        this.empID = newEmpID;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setRSINumber(String newRSINumber){
        this.rsiNumber = newRSINumber;
    }
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    
    //raise salary method
    public void raiseSalary(double raise){
        salary += raise;  
    }
    
    //print method
    public void print(){
        System.out.println("Employee ID is:       "+empID);
        System.out.println("Name is:              "+name);
        System.out.println("RSI Number is:        "+rsiNumber);
        System.out.println("Salary is:            "+defaultFormat.format(salary));
        
    }
}


    
