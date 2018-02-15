package exercise2;

import java.util.*;

public class Deposit {

    public static void main(String args[]) {
        double balance = 100;
        double deposit;

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Please enter the amount you wish to deposit ");
            deposit = in.nextDouble();
            balance = balance + deposit;
            System.out.println("New balance = " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry ");
            e.printStackTrace(System.out);
        }
    }
}
