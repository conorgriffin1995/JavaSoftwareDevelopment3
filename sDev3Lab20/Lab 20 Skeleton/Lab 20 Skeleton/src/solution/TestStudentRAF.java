package solution;

import java.io.*;
import java.util.Scanner;

public class TestStudentRAF {

    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);

        String fileName = "files/students.dat";
        CreateRAF create = new CreateRAF(fileName);

        File file = create.getFile();

        // infinite loop
        while (true) {
            System.out.println("Please press 1 to enter student details");
            System.out.println("Please press 2 if you want to view student details");
            System.out.println("Please press 3 to delete a student record");
            System.out.println("Please press 4 to update a record");
            System.out.println("Press 5 to quit");

            int choice = in.nextInt();
            String clearnewLine = in.nextLine();

            if (choice == 1) {
                System.out.println("please enter the Student Number");
                int num = in.nextInt();
                
                if (FindStudentRecord.find(file, num)) {
                    System.out.println("ERROR: That record already exist");
                } else {
                clearnewLine = in.nextLine();
                System.out.println("please enter the first name");
                String first = in.nextLine();
                System.out.println("please enter the last name");
                String last = in.nextLine();
                System.out.println("please enter the gpa");
                double gpa = in.nextDouble();

                // call static method to write RAF record to file
                WriteRAFRecord.writeRecord(file, num, first, last, gpa);
                }
            } else if (choice == 2) {
                System.out.println("Please enter the number of the record you wish to view");
                int recordNum = in.nextInt();
                clearnewLine = in.nextLine();
                // call static method to read record from RAF file
                ReadRAFRecord.readRecord(file, recordNum);
            } else if (choice == 3) {
                System.out.println("Please enter the number of the record you wish to delete");
                int recordNum = in.nextInt();
                clearnewLine = in.nextLine();
                // call static method to delete record from RAF file
                DeleteRAFRecord.deleteRecord(file, recordNum);
            } else if (choice == 4) {

                System.out.println("Please enter the number of the record you wish to update");
                int recordNum = in.nextInt();
                clearnewLine = in.nextLine();

                // check that there is data in the record
                if (!FindStudentRecord.find(file, recordNum)) {
                    System.out.println("ERROR: That record does not exist");
                } else {
                    System.out.println("please enter the first name");
                    String first = in.nextLine();
                    System.out.println("please enter the second name");
                    String last = in.nextLine();
                    System.out.println("please enter the gpa");
                    double gpa = in.nextDouble();

                    // call static method to delete record from RAF file
                    UpdateRAFRecord.updateRecord(file, recordNum, first, last, gpa);
                }
            } else {
                System.exit(0);
            }
        }
    }
}
