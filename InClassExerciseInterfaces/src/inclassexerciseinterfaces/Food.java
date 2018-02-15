package inclassexerciseinterfaces;

/**
 *
 * @ConorGriffin x00111602
 */
public class Food extends Goods {
 
	private double calories;

	  public Food( String des,double pr,double cal)
	  {
	    super(des,pr);
	    calories = cal ;
	  }

	  public void print()
	  {
	    super.print( );
	    System.out.printf( "Calories: %.2f %n",calories);
	  }
}
