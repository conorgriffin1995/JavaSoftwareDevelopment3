package exercise1;
import java.util.ArrayList;

//Lab 23
//X00111602

public class Buffer {

    private final ArrayList<Integer> taskQueue;
    private final int MAX_CAPACITY;
    
    public Buffer(ArrayList<Integer> sharedQueue, int c){
        
        this.taskQueue = sharedQueue;
        MAX_CAPACITY = c;
        
    }
    
    public int getMAX_CAPACITY(){
        return MAX_CAPACITY;
    }
    
    public void produce(int i){
        {
            synchronized(taskQueue){
                while(taskQueue.size() == MAX_CAPACITY){
                    System.out.println("Queue is full " + Thread.currentThread().getName()
                    + " is waiting , size: " + taskQueue.size());
                    try{
                        taskQueue.wait();
                    } catch(InterruptedException ex){
                }
            }
                
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException ex){
                    
                }
                taskQueue.add(i);
                System.out.println("Produced: " + i);
                taskQueue.notifyAll();
        }
        
    }
    

    }
    
    public void consume(){
        {
            synchronized(taskQueue){
                while (taskQueue.isEmpty()){
                    System.out.println("Queue is empty " + Thread.currentThread().getName()
                    + " is waiting , size: " + taskQueue.size());
                    
                    try{
                        taskQueue.wait();
                    } catch(InterruptedException ex){
                        
                    }
                }
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
                int j = taskQueue.remove(0);
                System.out.println("Consumed: " + j);
                taskQueue.notifyAll();
            }
        }
    }

}

class Producer implements Runnable{
    
    private Buffer buf;
    
    public Producer(Buffer buf){
        this.buf = buf;
    }
    
    @Override
    public void run(){
        
        int counter = 0;
        while(true) {
            buf.produce(counter++);
        }      
    }   
}

class Consumer implements Runnable{
    
    private Buffer buf;
    
    public Consumer(Buffer buf){
        this.buf = buf;
    }
    @Override
    public void run(){
        while(true){
            buf.consume();
        }
    }
    
}