package exercise4Skeleton;

import java.io.*;

public class TryReadFile {

    public static void main(String[] args) {
        String s;

        File myDir = new File("files");
        File myFile = new File(myDir, "people.txt");

        try (BufferedReader in = new BufferedReader(new FileReader(myFile)))
        {
            while ((s = in.readLine()) != null) 
            {
                System.out.println(s);
            }
        } catch (FileNotFoundException fnf) 
        {
            System.out.println("File Not found");

        } catch (IOException ex) 
        {

        }
    }
}
