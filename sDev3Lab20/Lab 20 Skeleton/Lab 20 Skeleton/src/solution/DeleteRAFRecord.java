package solution;
import java.io.*;

public class DeleteRAFRecord {
 
   public static void deleteRecord(File file, int recordNum) {
       RAFStudentRecord record = new RAFStudentRecord();
 
       try {
           // seek moves the file position pointer for object output
           // based on calculation below
           // Student numbers entered should be between 1 and 100​
           RandomAccessFile raf = new RandomAccessFile(file, "rw");
           raf.seek((recordNum - 1) * RAFStudentRecord.SIZE);
           record.read(raf);
 
           // check that there is data in the record
           if (record.getSnum() == 0) {
               System.out.println("ERROR: That record does not exist \n");
               return;
           }
           raf.seek((recordNum - 1) * RAFStudentRecord.SIZE);
          
           record.setSnum(0); // reset the student number
          
           record.write(raf); // update the record
           System.out.println("Record Deleted");
           raf.close();
       } catch (EOFException eof) {
           System.out.println(eof.getMessage());
       } catch (IOException io) {
           System.out.println(io.getMessage());
       }
   }
}