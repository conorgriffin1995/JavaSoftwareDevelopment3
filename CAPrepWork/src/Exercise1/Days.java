package Exercise1;

public class Days {

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        try {
            System.out.println("The next day is ");
            System.out.println(days[2]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("ArrayIndexOutOfBoundsException caught");
//            e.printStackTrace();
            
        }
        
        System.out.println("End Of Program");

    }

}
