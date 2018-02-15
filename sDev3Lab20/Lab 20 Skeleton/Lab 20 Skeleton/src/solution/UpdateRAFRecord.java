package solution;
import java.io.*;


public class UpdateRAFRecord {
 
   public static void updateRecord(File file, int recordNum, String firstName, String lastName, double gpaValue) {
       RAFStudentRecord record = new RAFStudentRecord();
       try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
           raf.seek((recordNum - 1) * RAFStudentRecord.SIZE);
           record.read(raf);
 
           record.setFirstName(firstName);
           record.setLastName(lastName);
           record.setGpa(gpaValue);
 
           raf.seek((recordNum - 1) * RAFStudentRecord.SIZE);
           record.write(raf);
           raf.close();
       } catch (EOFException eof) {
           System.out.println("End of File Reached");
       } catch (IOException io) {
           System.out.println(io.getMessage());
       }
   }
 
   
}
