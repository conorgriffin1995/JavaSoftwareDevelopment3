package example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryReadFile {

    public static void main(String[] args) throws IOException {
        String s;

        File myDir = new File("files");
        File myFile = new File(myDir, "people.txt");
        try (BufferedReader in = new BufferedReader(new FileReader(myFile))) {
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
        }
    }
}


