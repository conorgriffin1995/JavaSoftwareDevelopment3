package Exercise1;
import java.util.*;
//Lab17
//Conor Griffin

public class Exercise1 { 
    
    public static void main(String[] args) {
        
        
        
        int input1 = 0;
        int input2 = 0;
        int result = 0;        
        double divider = 0.0;
        int numIncrement = 1;
        
        
        boolean loop = true;
        
        //Input 1
        do
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter number "+numIncrement+" : ");
                input1 = in.nextInt();
                loop = false;
                numIncrement++;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid integer entered. Please try again.");   
            }
            finally
            {
                System.out.println("Done");
            }
            
        }while(loop);
        
        loop = true;
        //Input 2
        do{
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter number "+numIncrement+" : ");
                input2 = in.nextInt();
                loop = false;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid integer entered. Please try again.");
               
            }
            finally
            {
                 System.out.println("Done");
            }
        }while(loop);
        
        System.out.println("The inputs are : "+input1+", "+input2);
        
        do{
            try
            {
                divider = input1/input2;  
                System.out.println("The result is: "+divider);
            }
            catch(ArithmeticException e)
            {
                System.out.printf("\nException caught: Division by zero.", e);
                System.out.println(" Second number is 0, cannot do division.");    
            }
            finally
            {
                System.out.println("Done");
            }
            
        }while(loop);      
  }
    
}
