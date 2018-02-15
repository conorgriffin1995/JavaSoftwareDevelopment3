package inclassexerciseinterfaces;

/**
 *
 * @ConorGriffin x00111602
 */
public class TestClass {
    
    public static void main(String[] args) {
        
		Goods gd = new Goods("bubble bath", 1.40);
		Food fd = new Food("ox tails", 4.45, 1500);
		Toy ty = new Toy("Lego", 54.45, 8);
		Book bk = new Book("Emma", 24.95, "Austin");


		gd.print();
		fd.print();

		ty.print();
		System.out.printf("Tax is: €%.2f%n",ty.calculateTax());

		bk.print();
		System.out.printf("Tax is: €%.2f%n",bk.calculateTax());        
      
    }
    
}
