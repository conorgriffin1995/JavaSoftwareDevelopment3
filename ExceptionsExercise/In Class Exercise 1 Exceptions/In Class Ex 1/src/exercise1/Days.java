package exercise1;

public class Days {
	public static void main (String args[])
    {
        String days [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        try{
            System.out.println("The next day is ");
            System.out.println(days[4]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught");
//          e.printStackTrace(System.out);
        }    
        System.out.println("End of Program");
    }
}

