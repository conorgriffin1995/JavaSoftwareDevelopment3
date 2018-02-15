package sdev3lab1;

/**
 *
 * @author x00111602
 */
public class Manager extends Employee {
    
   private String depName;
   
   public Manager(String depNameIn, int empIDIn, String nameIn, String rsiNumberIn, double salaryIn){
   
       super(empIDIn, nameIn, rsiNumberIn, salaryIn);
       depName = depNameIn; 
       
   }
    //Getter Method
       public String getDepName(){
           return this.depName;
       }
    //Setter Method
       public void setDepName(String depNameIn){
           this.depName = depNameIn;
       }
       
    //Print Method
       public void print(){
           super.print();
           System.out.println("Department Name is :  "+depName);
       }
    
}
