package exercise1;
import java.util.ArrayList;
    
    
 
public class TestProducerConsumer {
 
   public static void main(String[] args) {
       final ArrayList<Integer> taskQueue = new ArrayList<>();
       final int SIZE = 5;
 
       Buffer b = new Buffer(taskQueue, SIZE);
       int MAX_CAPACITY = 5;
       Thread tProducer = new Thread(new Producer(b), "Producer");
       Thread tConsumer = new Thread(new Consumer(b), "Consumer");
       tProducer.start();
       tConsumer.start();
 
   }
 
}
