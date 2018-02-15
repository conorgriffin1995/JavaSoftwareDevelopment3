package inclassexerciseinterfaces;

/**
 *
 * @ConorGriffin x00111602
 */
public class Book extends Goods implements Taxable {
  
	private String author;

	public Book(String des,double pr,String auth) {
		super(des, pr);
		author = auth;
	}

	public void print() {
		super.print();
		System.out.println("Author: " + author);
	}
        
        public double calculateTax()
          {
              return getPrice() * taxRate;
          }
}
