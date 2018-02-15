/*
Source: http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
 */
package example3;

public class Fruit implements Comparable<Fruit>{
	
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

        @Override
	public int compareTo(Fruit compareFruit) { 
		System.out.println("getQuantity"+compareFruit.getQuantity());
                System.out.println("This Quantity"+this.quantity);
                // ascending order
		//return this.quantity - compareFruit.getQuantity();
		
		//descending order
		return compareFruit.getQuantity() - this.quantity;
		
	}	
}

