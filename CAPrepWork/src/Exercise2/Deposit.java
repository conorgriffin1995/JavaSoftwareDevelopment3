package Exercise2;

import java.util.*;

public class Deposit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double bankBalance = 550;
        double deposit = 0;
        boolean loop = true;
        do{
        try {
            System.out.printf("\nPlease enter the amount you would like to deposit: €");
            deposit = in.nextDouble();
            bankBalance += deposit;
            System.out.printf("New Balance: €%.2f", bankBalance);
        }//end try
        catch(InputMismatchException i){
            System.out.printf("\nError: \n", i);
            in.nextLine();
            System.out.println("You must enter a number. Please try again.");
        }//end catch
        if(deposit == 0){
            loop = false;
            System.out.println(", Thank you for using Bank Of Ireland, \nplease come back later to deposit again.");
        } 
    }while(loop);
        
        
    }
}


