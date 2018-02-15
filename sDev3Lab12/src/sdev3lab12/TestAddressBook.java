package sdev3lab12;
import java.util.Scanner;
/**
 *
 * @author x00111602
 */
public class TestAddressBook {
    
    public static void main(String[] args) {
        
        
        
        String owner;
        Scanner in = new Scanner(System.in);
        
        
        
        System.out.println("Please enter the owner of the address book ");
        owner = in.nextLine();   
        
        AddressBook ab = new AddressBook(owner);
        ab.fillList();
        System.out.println("Address book belongs to "+ab.getName());
        ab.print();
        System.out.println("Number of male contacts:"+ab.calcMContacts());
        System.out.println("");
        System.out.println("Total number of contacts: "+AddressBook.getTotalContacts());
        
        
        
    }
    
}
