package exercise2;


public class Test {
    
    public static void main(String[] args) {
        
        int[] data = {55, 76, 46, 23};    
        MiniDataSet m1 = new MiniDataSet(data);
        
        Thread t1 = new Thread(m1);
        t1.start();
        
    } 
}
