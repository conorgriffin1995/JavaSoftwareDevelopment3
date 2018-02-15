package sdev3lab15.Exercise1;
import java.io.*;
import java.util.*;

//Conor Griffin
//Lab 15
//Exercise1

public class WriteTabDelimited {
    
    public static void main(String[] args) throws IOException
    {
        
    String[][] newArray = new String[4][3];
    
    File myDir = new File ("Files");
    File myFile = new File (myDir, "employeesTab.txt");
    
    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            try (BufferedWriter bWriter = new BufferedWriter(new FileWriter((myFile))))
            {
            bWriter.write("Donnel\tJohn\t34");
            bWriter.write("\nCollins\tTony\t18");
            bWriter.write("\nGreally\tJim\t16");
            bWriter.write("\nBrady\tNoel\t69");
           }
        }   
    }
    
    }   
}
