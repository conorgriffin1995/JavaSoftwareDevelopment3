package solution;
import java.io.*;


public class WriteRAFRecord {

    public static void writeRecord(File file, int studentNum, String firstName, String lastName, double gpaValue) {
       RAFStudentRecord record = new RAFStudentRecord();
       try {
           // Open file for writing
           try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
               // set the values on the Record class
               // the record will be written to file
               record.setSnum(studentNum);
               record.setFirstName(firstName);
               record.setLastName(lastName);
               record.setGpa(gpaValue);
 
               // seek moves the file position pointer for object output
               // based on calculation below
               // Student numbers entered should be between 1 and 100
               raf.seek((studentNum - 1) * RAFStudentRecord.SIZE);
               record.write(raf);
           }
       } catch (FileNotFoundException fnf) {
           System.out.println("Error:"+fnf.getMessage());
       } catch (IOException io) {
           System.out.println("Error"+io.getMessage());
       }
   }
}
