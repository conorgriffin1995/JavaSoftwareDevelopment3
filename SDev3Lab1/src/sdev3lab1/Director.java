package sdev3lab1;

/**
 *
 * @author x00111602
 */
public class Director extends Manager {
    
    private double budget;
    
    public Director(double budgetIn,String depNameIn, int empIDIn, String nameIn, String rsiNumberIn, double salaryIn){
   
       super(depNameIn, empIDIn, nameIn, rsiNumberIn, salaryIn); 
       budget = budgetIn;
   }
    
    //Getter Method
    public double getBudget(){
        return this.budget;
    }
    //Setter Method
    public void setBudget(double budgetIn){
        budget = budgetIn;
    }
    
    //print method
    public void print(){
        super.print();
        System.out.println("Budget is:            "+defaultFormat.format(budget));
        System.out.println("");
        System.out.println("--------------- ");
    }
    
}
