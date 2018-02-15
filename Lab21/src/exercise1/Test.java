package exercise1;


public class Test {
    
    public static void main(String[] args) {
        
        double[] data = {5.5, 7.6, 4.6, 2.3};
        
        LUASJourney l1 = new LUASJourney(data); 
        
        Thread t1 = new Thread(l1);
        
        t1.start();
        
    }
    
}
