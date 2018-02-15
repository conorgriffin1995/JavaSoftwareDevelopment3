package inclassexerciseinterfaces;

/**
 *
 * @ConorGriffin x00111602
 */
public class Goods {
    
	private String description;
	private double price;

	public Goods(String des, double pr) {
		description = des;
		price = pr;
	}

	public double getPrice() {
		return price;
	}

	public void print() {
		System.out.printf("Item: %s  Price: €%.2f%n",description,price);
	}
    
    
    
}
