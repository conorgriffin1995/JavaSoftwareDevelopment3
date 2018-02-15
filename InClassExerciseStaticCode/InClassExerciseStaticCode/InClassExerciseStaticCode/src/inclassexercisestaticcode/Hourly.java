package inclassexercisestaticcode;

public class Hourly extends Employee  
{ 
   private double rate; 
   private double hours; 
   
   public Hourly(String name, double rate, double hours)  
   { 
      super(name); 
      this.rate = rate; 
      this.hours = hours; 
   } 
   @Override
   public double pay()  { 
      return rate * hours; 
   } 
  
   @Override
   public void sickpay()  { 
      System.out.println("No entitlements"); 
     
   } 
   @Override
   public String toString()  { 
      return super.toString() + " (rate is " + rate + " and hours are " + hours + ')'; 
   } 
} 

