package Exercise1;

/**
 *
 * @author conorgriffin
 */
public class TestStockItem {
    
    public static void main(String[] args) {
        
        stockItem s1 = new stockItem(123, "Shampoo", 100, 10, 25);
        
        s1.takeOnStock(80);
        s1.issueStock(30);
        s1.issueStock(20);
        
        
        System.out.println("\nAmount left in stock is: "+s1.getInStock());
    }
    
}