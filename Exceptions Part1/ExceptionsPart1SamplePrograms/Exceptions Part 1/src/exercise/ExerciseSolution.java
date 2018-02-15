package exercise;

public class ExerciseSolution {

    public static void main(String[] args) {
        int x[] = {6, 7, 8, 9};

        try {
            System.out.println(x[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception caught");
            e.printStackTrace(System.out);
        }
        System.out.println("After try block");
        System.out.println("Program now continues");
    }
}


