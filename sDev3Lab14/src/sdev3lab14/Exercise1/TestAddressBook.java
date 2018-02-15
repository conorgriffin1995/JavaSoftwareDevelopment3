/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab14.Exercise1;

import java.util.Scanner;
import java.io.*;
public class TestAddressBook {

    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("Enter the owner of address book");
        name = in.nextLine();

        AddressBook a = new AddressBook(name);
        a.fillList();
        System.out.println("\nAddress Book belongs to:" + a.getName());
        a.printList();
        System.out.println("\nNumber of male friends are:" + a.calcNumMales());

        System.out.println("\nTotal Contacts:" + AddressBook.getTotalContacts());
    }
}
