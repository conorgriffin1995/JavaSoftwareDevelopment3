package sdev3lab16.Exercise1;

//Exercise 16
//Conor Griffin

import java.io.*;

public class TestCookie {

    public static void main(String[] args) throws IOException {

        System.out.println("Testing Cookie class");

        //Create a cookie object
        Cookie firstCookie = new Cookie();

        //Create a new cookie file
        System.out.println("Creating a new file: cookie1.txt");
        firstCookie.createCookie("files/cookie1.txt", "joebloggs@hotmail.com; date:02112015; searchkey:Christmas+trees");
        //Verify cookie file was successfully created by printing contents of file
        System.out.println("Contents of cookie1.txt: ");
        firstCookie.readCookie("files/cookie1.txt");

        //Modify the cookie file
        firstCookie.modifyCookie("files/cookie1.txt", "joebloggs@hotmail.comu; date:03112015; searchkey:Christmas+lights");

        //Verify cookie file was successfully modified by printing contents of file
        System.out.println("Contents of cookie1.txt after modification ");
        firstCookie.readCookie("files/cookie1.txt");

        //Delete cookie file
        firstCookie.deleteCookie("files/cookie1.txt");
        //Verify cookie from activity 1 is deleted by trying to read it
        System.out.println("Does cookie exist?");
        try 
        {
            firstCookie.readCookie("files/cookie1.txt");
        } catch (IOException ex)
        {
            System.out.println("ERROR MESSAGE - activity 1: Exception thrown - file no longer exists");
        }

        System.out.println();
	
    }
}
