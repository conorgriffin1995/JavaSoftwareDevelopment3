package Exercise3;
import java.util.*;

public class Pay implements Rates {
    
    public static void main(String[] args) {
        
        int hoursWorked = 0;
        double pay = 0;
        Scanner in = new Scanner(System.in);
        boolean loop = false;
        
        while(!loop){
           try{
               System.out.print("Please enter hours worked: ");
               hoursWorked = in.nextInt();
               
               if(hoursWorked < 0){
                   throw new NegativeHoursException();
               }
               
               pay = hoursWorked * PAYRATE;
               System.out.printf("\nYou earned: €%.2f",pay);
               loop = true;
           } //end try
           catch(InputMismatchException i){
               System.out.printf("\nInvalid Data Entered \n");
               in.nextLine();
               System.out.println("You must enter integers. Please try again.\n");
           }//end catch
           catch(NegativeHoursException n){
               System.out.println(n.getMessage());
               n.printStackTrace();
           }
        }
        
    }
    
    
}
