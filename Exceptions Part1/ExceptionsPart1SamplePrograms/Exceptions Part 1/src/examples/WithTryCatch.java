package examples;

public class WithTryCatch {

    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        try {
            System.out.println("Try block entered, i = " + i + " j = " + j);
            System.out.println(i / j);
            System.out.println("Ending try block");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught");
            e.printStackTrace(System.out);
        }
        System.out.println("After try block");
        System.out.println("Program now continues...");
    }
}


