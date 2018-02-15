package sdev3lab3ex2;
import java.util.Scanner;
/**
 *
 * Conor Griffin x00111602
 */
public class TestFriends {
    
    public static void main(String[] args) {
        
        int []friendArray;
        String update;
        
        Scanner in = new Scanner (System.in);
        
        
        System.out.println("Please enter the number of friends in your phone book..");
        friendArray = new int[in.nextInt()];
        String s = in.nextLine();
        
        Friend[] friend = new Friend[friendArray.length];
        
        for (int i = 0; i<friendArray.length; i++)
        {
            System.out.println("Please enter name "+(i+1)+" : ");
            String name = in.nextLine();
            
            System.out.println("Please enter number "+(i+1)+" : ");
            String phoneNum = in.nextLine();
            
            friend[i] = new Friend(name, phoneNum);
            
            System.out.println(friend[i].toString());
            
        }
        
        
        
        System.out.println("Please enter the name of the person whose number you wish to update:");
        update = in.next();
        
        for (int i = 0; i < friendArray.length; i++)
        {
            if(friend[i].getName().equals(update))
            {
                System.out.println("Please enter the new number for "+ friend[i].getName());
                String newNumber = in.next();
                
                System.out.println("");
                friend[i].setPhoneNum(newNumber);
                
            }
            
            else if(!update.equals(friend[i].getName()))
            {
                System.out.println("Name not in book");
            }
        }
        
    }
    
}
