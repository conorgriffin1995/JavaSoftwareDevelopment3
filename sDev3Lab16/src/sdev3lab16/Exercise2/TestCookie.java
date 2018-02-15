package sdev3lab16.Exercise2;

import java.io.*;

public class TestCookie {

    public static void main(String[] args) throws IOException {


        //--------------------------------------------------
        //Uncomment the indicated lines when you complete Exercise 2
        System.out.println("Exercise 2");
        System.out.println();

	//Exercise 2 Part 1
        //Create another cookie object
        //**Uncomment next line
        Cookie secondCookie = new Cookie();
         
        //attempt to read cookie before creating it
        //**Uncomment next two lines
         
        System.out.println("Attempting to read a cookie that does not exist");
        secondCookie.readCookie("files/cookie2.txt");
        
        
        
        
        //Exercise 2 Part 2
	//Create a new cookie file
        //**Uncomment next two lines
         
        System.out.println("Creating a new file: cookie2.txt");
        secondCookie.createCookie("files/cookie2.txt", "visitor:abc@def.com; purchase:fiction+book");
         
	//Verify cookie file was successfully created by printing contents of file
        //**Uncomment next line
         
        System.out.println("Contents of cookie2.txt: ");
        secondCookie.readCookie("files/cookie2.txt");
         
         
        //Change cookie to be read only, then try to update it
        //**Uncomment next four lines
        File cookieFile = new File("cookie2.txt");
        cookieFile.setReadOnly();
        System.out.println("made cookie file read-only");
        secondCookie.modifyCookie("cookie2.txt", "visitor:meToo@def.com; purchase:fiction+book");
    }
}
