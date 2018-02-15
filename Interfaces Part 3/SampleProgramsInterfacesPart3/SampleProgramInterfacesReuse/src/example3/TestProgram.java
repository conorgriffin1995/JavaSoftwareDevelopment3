package example3;

public class TestProgram {
	public static void main(String[] args)
	    {
               DataSet empData = new DataSet();
	 
	       empData.calculate(new FullTime("John", 50000));
	       empData.calculate(new PartTime("Paddy", 30.0, 40.0));
	       empData.calculate(new FullTime("Nick", 90000));
	 
	       System.out.printf("Average pay = €%,.2f%n",empData.getAverage());
	       System.out.printf("Highest pay value = €%,.2f",empData.getMaximum().pay());
	    }
}
