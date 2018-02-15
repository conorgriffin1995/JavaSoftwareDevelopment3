
import p1.Employee;
import p1.Hourly;
import p2.Salaried;

public class TestEmp  { 
    
   public static final int MAX_EMPLOYEES = 10; 
   
   public static void main(String[] args)  
   { 
      Employee[] employees = new Employee[MAX_EMPLOYEES]; 
      System.out.println("Initial Employee Count before object creation is:" +Employee.getempCount());
      int emp = 0; 
      employees[emp++] = new Hourly("George Clooney", 75.00, 2.5); 
      employees[emp++] = new Salaried("Brad Pitt", 125.00); 
      employees[emp++] = new Hourly("Daniel Craig", 85.00, 3.0); 
      employees[emp++] = new Salaried("Clive Owen", 150.00); 
      employees[emp++] = new Hourly("Jude Law", 65.00, 2.0); 
      System.out.println("Employee Count after object creation is:" +Employee.getempCount());
      for (int i = 0; i < emp; ++i)  
      { 
         System.out.println("employee:  " + employees[i]); 
         System.out.println("pay:  " + employees[i].pay()); 
         employees[i].sickpay();
         employees[i].resign();
         System.out.println(); 
      } 
      System.out.println("Employee Count after making all employees redundant is:" +Employee.getempCount());
   } 
} 
