package exercise1Skeleton;


import java.util.Scanner;

public class TestAddressBook {

    public static void main(String args[])  {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("Enter the owner of address book");
        name = in.nextLine();

        AddressBook a = new AddressBook(name);
        a.fillList();
        System.out.println("Address Book belongs to:" + a.getName());
        a.printList();
        System.out.println("Number of male friends are:" + a.calcNumMales());

        System.out.println("Total Contacts:" + AddressBook.getTotalContacts());
    }
}
