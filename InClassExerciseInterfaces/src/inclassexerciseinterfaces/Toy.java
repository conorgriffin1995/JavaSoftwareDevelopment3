package inclassexerciseinterfaces;

/**
 *
 * @ConorGriffin x00111602
 */
public class Toy extends Goods implements Taxable{

	private int minimumAge;

	  public Toy(String des,double pr,int min)
	  {
	    super( des, pr );
	    minimumAge  = min ;
	  }

	  public void print()
	  {
	    super.print() ;
	    System.out.println( "Minimum age: " + minimumAge );
	  }
          
          public double calculateTax()
          {
              return getPrice() * taxRate;
          }
}
