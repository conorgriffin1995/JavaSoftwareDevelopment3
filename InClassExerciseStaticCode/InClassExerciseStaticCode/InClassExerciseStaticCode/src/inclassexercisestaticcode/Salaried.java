package inclassexercisestaticcode;

public class Salaried extends Employee  
{ 
   private double salary; 
   
   public Salaried(String name, double salary)  
   { 
      super(name); 
      this.salary = salary; 
   } 
  
 
   @Override
   public double pay()  
   { 
      return salary; 
   } 
   
   @Override
   public void sickpay()  { 
      System.out.println("1 day per month"); 

   } 
 
   @Override
   public String toString()  
   { 
      return super.toString() + " (salary is " + salary + ")"; 
   } 

  
} 
