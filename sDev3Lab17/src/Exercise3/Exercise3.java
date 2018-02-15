package Exercise3;

import java.util.*;

//Conor Griffin
//x00111602
//Exercise 3
public class Exercise3 {
    
    public static void main(String[] args) {
        
    

    int i = 0;
    int array[] = new int[9];
    boolean test = false;
    
    

    
        do{
    
        
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter number " + (i + 1) + " : ");
                array[i] = in.nextInt();
                i++;

                if (i == array.length) {
                    test = true;
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Error in input, Please try again.");
            } 
            
        }while(test == false);
        
        
        
//        if(test == true){
//            Arrays.sort(array);
//            for(int j = 0; j < array.length; j++){
//                System.out.println("number "+ (j + 1) +": "+array[j]);
//            }
            System.out.println("The largest number is: "+array[array.length-1]);
//        }
        
    }

}
