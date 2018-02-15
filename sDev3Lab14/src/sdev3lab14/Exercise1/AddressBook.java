package sdev3lab14.Exercise1;

import java.util.*;
import java.io.*;

public class AddressBook {

    private String owner;
    private ArrayList<Contact> myList = new ArrayList<>();
    private static int totalContacts = 0;

    public AddressBook(String owner) {
        this.owner = owner;
    }

    public void fillList() throws IOException {
        
        Random select = new Random();
        int numContacts;
        numContacts = 1 + select.nextInt(7);
        String name = "";
        String mobile = "";
        char gender = '\0';
        
        File myDir = new File("Files");
        File myFile = new File(myDir,"contacts.txt");
        
        try (BufferedReader in = new BufferedReader(new FileReader(myFile))){
        for(int i = 0; i < numContacts; i++)
        {
            name = in.readLine();
            gender = in.readLine().charAt(0);
            mobile = in.readLine();
            myList.add(new Contact(name, gender, mobile));
        }
        
       }
     
    }      
       
    public void printList() {
        for (int i = 0; i < myList.size(); i++) {
            myList.get(i).printContact();
        }

    }

    public int calcNumMales() {
        int numMales = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).gender == 'm') {
                numMales++;
            }
        }
        return numMales;
    }

    public String getName() {
        return owner;
    }

    public static int getTotalContacts() {
        return totalContacts;
    }
    

    class Contact {

        private String name;
        private char gender;
        private String mobile;

        public Contact(String name, char gender, String mobile) {
            this.name = name;
            this.mobile = mobile;
            this.gender = gender;
            totalContacts++;
        }

        public void printContact() {
            System.out.println(name + "," + gender + "," + mobile);
        }
    }
}
