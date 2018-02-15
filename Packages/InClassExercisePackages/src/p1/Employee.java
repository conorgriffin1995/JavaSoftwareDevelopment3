package p1;

abstract public class Employee  

{
   private String name; 
   private static int empCount = 0; 
   
   public Employee(String name)  
   { 
	   empCount++;
       this.name = name;
   } 
   
   public double pay()
   {
       return 0.0;
   }

   public abstract void sickpay();
   
   public static int getempCount()
   {
       return empCount;
   }
   public void resign()
   {
       empCount--;
   }
  
   public String toString()  
   { 
      return "name is " + name; 
   } 
  
   
} 
