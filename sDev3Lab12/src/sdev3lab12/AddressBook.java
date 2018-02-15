package sdev3lab12;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author x00111602
 */
public class AddressBook {

    private String owner;
    private static int totalContacts;
    ArrayList<Contact> contacts = new ArrayList();
    
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    
    public AddressBook(String owner){
        
        this.owner = owner;
           
    }
    
    public void fillList() {
        Scanner in = new Scanner(System.in);
        Random select = new Random();
        int numContacts;
        numContacts = 1 + select.nextInt(3);
        String name;
        String mobile;
        char gender;
        String schar;

        for (int i = 0; i < numContacts; i++) {
            System.out.print("Enter name for contact " + (i + 1)+": ");
            name = in.nextLine();
            System.out.print("Enter gender for "+name+" " + (i + 1)+": ");
            schar = in.nextLine();
            gender = schar.charAt(0);
            System.out.print("Enter mobile for contact "+name+" " + (i + 1)+": ");
            mobile = in.nextLine();

            contacts.add(new Contact(name, gender, mobile));

        }
    }
    
    public void print(){
        System.out.println("Address Book Owner: "+owner);
        for(int i = 0; i < contacts.size(); i++)
        {
            contacts.get(i).printContact();
        }
        
    }
    
    public int calcMContacts(){
        int totalMale = 0;
        for(int i = 0; i < contacts.size(); i++)
        {
            if(contacts.get(i).gender == 'M'){
                totalMale++;
            }
        }
        return totalMale;
    }
    
    public static int getTotalContacts(){
        return totalContacts;
    }
    
    public String getName(){
        return owner;
    }
    
    
    class Contact{
        
        String name;
        char gender;
        String mobile;
        
        public Contact(String name, char gender, String mobile){
            
            this.name = name;
            this.gender = gender;
            this.mobile = mobile;
            totalContacts++;
        }
        
        public void printContact(){
        
        System.out.print("\nContact name:     \t"+name);
        System.out.print("\nContact gender: \t"+gender);
        System.out.print("\nContact mobile: \t"+mobile);
        System.out.println("");  
            
        }
        
    }
    
    
}
