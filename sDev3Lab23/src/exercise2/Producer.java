package exercise2;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
 
public class Producer implements Runnable {
 
   private BlockingQueue queue = null;
 
   public Producer(BlockingQueue queue) {
       this.queue = queue;
   }
 
   @Override
   public void run() {
       Random rand = new Random();
       int res = 0;
       try {
 
           res = add(rand.nextInt(100), rand.nextInt(50));
           System.out.println("Produced: " + res);
           queue.put(res);
           Thread.sleep(1000);
 
           res = add(rand.nextInt(100), rand.nextInt(50));
           System.out.println("Produced: " + res);
           queue.put(res);
           Thread.sleep(1000);
           
           res = add(rand.nextInt(100), rand.nextInt(50));
           System.out.println("Produced: " + res);
           queue.put(res);
 
       } catch (InterruptedException e) {
 
           e.printStackTrace();
 
       }
   }
   
    public int add(int x, int y) {
       int result = 0;
       result = x + y;
       return result;
   }
}
