package solution;
import java.io.*;

public class ReadRAFRecord {
 
   public static void readRecord(File file, int recordNum) {
       RAFStudentRecord record = new RAFStudentRecord();
       try {
           try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
               // seek moves the file position pointer for object output
               // based on calculation below
               // Student numbers entered should be between 1 and 100
               raf.seek((recordNum - 1) * RAFStudentRecord.SIZE);
               record.read(raf);
 
               // check that there is data in the record
               if (record.getSnum() == 0) {
                   System.out.println("ERROR: That record does not exist");
                   return;
               }
 
               String values[] = {String.valueOf(record.getSnum()),
                   record.getFirstName(),record.getLastName(),
                      String.valueOf(record.getGpa())};
 
               for (String value : values) {
                   System.out.println(value);
               }
           }
       } catch (EOFException eof) {
           System.out.println("End of file reached");
       } catch (IOException io) {
           System.out.println(io.getMessage());
       }
   }
}
