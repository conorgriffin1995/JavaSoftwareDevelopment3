package sdev3lab16.Exercise1;

//Exercise 16
//Conor Griffin

import java.io.*;

public class Cookie {

    public void createCookie(String fileName, String cookieValue) throws IOException {

      //Create a File object using the parameter fileName
      //Create a FileWriter object wrapped inside a BufferedWriter
      //to enable writing to the file
      //Write the parameter cookieValue to the cookie file
      //Use try with resources to close the file
       
        File cFile = new File(fileName);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(cFile)))
        {
            
            bw.write(cookieValue);
            bw.newLine();
            
        }           
    }

    public void readCookie(String fileName) throws IOException {

        //Create a File object
        //Create a BufferedReader FileReader object to read the file
        //Read the contents of the cookie file
        
        String cookieVal;
        File cFile = new File(fileName);
        try(BufferedReader in = new BufferedReader(new FileReader(cFile)))
        {
            
            while((cookieVal = in.readLine()) != null)
            {
                System.out.println(cookieVal);
            }
            
        }    
    }
    
    public void modifyCookie(String fileName, String cookieValue) throws IOException {

      //Create a File object  using the parameter fileName
      //Create a FileWriter object to enable writing to the file
      //Write the cookie value
      //Close the file
        
      File cFile = new File(fileName);
      try(FileWriter f = new FileWriter(cFile,true))
      {
          f.write(cookieValue);
      }           
    }
    
    public void deleteCookie(String fileName) throws IOException {

      //Create a File object using the parameter fileName
      //Delete the actual file using the File object 
        
      File cFile = new File(fileName);
      
          if (cFile.delete() == true)
          {
              System.out.println("File deleted");
          }
          else
          {
              System.out.println("File not deleted");
          }
      
    }
}
