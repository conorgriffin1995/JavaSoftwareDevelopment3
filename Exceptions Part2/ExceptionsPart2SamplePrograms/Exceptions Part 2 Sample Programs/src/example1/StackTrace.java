package example1;

public class StackTrace {

    public static void main(String[] args) {
        System.out.println("Calling myMethod...");
        myMethod();
        System.out.println("Method main is done.");
    }

    public static void myMethod() {
        System.out.println("Calling produceError...");
        produceError();
        System.out.println("myMethod is done.");
    }

    public static void produceError() {
        String str = "abc";

        // The following statement will cause an error.
        System.out.println(str.charAt(3));
        System.out.println("produceError is done.");
    }
}
