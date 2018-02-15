/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author patriciamagee
 */
public class FindStudentRecord {
    public static boolean find(File file, int recordNum) throws IOException {
        RAFStudentRecord record = new RAFStudentRecord();
        boolean found = true;

        // seek moves the file position pointer for object output
        // based on calculation below
        // Student numbers eneterd should be between 1 and 100	
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.seek((recordNum - 1) * RAFStudentRecord.SIZE);
            record.read(raf);
            // check that there is data in the record
            if (record.getSnum() == 0) {
                found = false;

            }

        } catch (EOFException eof) {
            System.out.println(eof.getMessage());
        } catch (IOException io) {
            System.out.println("Error:");

        }
        return found;
    }
    
}
