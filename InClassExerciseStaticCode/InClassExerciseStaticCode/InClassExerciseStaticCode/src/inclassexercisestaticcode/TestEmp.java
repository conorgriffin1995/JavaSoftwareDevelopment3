package inclassexercisestaticcode;

public class TestEmp  { 
    
   public static void main(String[] args)  
   { 
      final int MAX_EMPLOYEES = 5;
      
      Employee[] employees = new Employee[MAX_EMPLOYEES]; 
      int emp = 0; 
      System.out.println("Initial Employee count before object creation is:"+Employee.getCount());
      employees[emp++] = new Hourly("George Clooney", 75.00, 2.5); 
      employees[emp++] = new Salaried("Brad Pitt", 125.00); 
      employees[emp++] = new Hourly("Daniel Craig", 85.00, 3.0); 
      employees[emp++] = new Salaried("Clive Owen", 150.00); 
      employees[emp++] = new Hourly("Jude Law", 65.00, 2.0); 
      System.out.println("Initial Employee count after object creation is:"+Employee.getCount());
      for (int i = 0; i < emp; ++i)  
      { 
         System.out.println("Employee:  " + employees[i]); 
         System.out.println("Pay:  " + employees[i].pay()); 
         employees[i].sickpay();
         System.out.println(); 
         employees[i].resign();
      } 
      System.out.println("Employee count after making all employees redundant is:"+Employee.getCount());
   } 
} 
