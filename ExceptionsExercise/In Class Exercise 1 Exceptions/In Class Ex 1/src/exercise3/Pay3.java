package exercise3;

import java.util.*;

public class Pay3 {

    public static void main(String[] args) {

        final int RatePerHour = 10;
        int hoursWorked;
        int earned;
        boolean valid = false;
        Scanner in = new Scanner(System.in);

        while (!valid) {
            try {

                System.out.println("Enter hours worked: ");
                hoursWorked = in.nextInt();

                if (hoursWorked < 0) {
                    throw new NegativeHoursException();
                }

                earned = hoursWorked * RatePerHour;
                System.out.println("You earned EUR " + earned + " today");
                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid data entered ");
                in.nextLine();
                // Need to clear the stream because once an exception is thrown data remains in the stream

            } catch (NegativeHoursException n) {
                System.out.println(n.getMessage());
                n.printStackTrace();
            }
        }
    }
}
