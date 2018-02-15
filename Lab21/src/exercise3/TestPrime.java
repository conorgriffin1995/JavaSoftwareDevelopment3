package exercise3;
import java.util.Scanner;


class CountPrimesThread implements Runnable{
    
    int id;
    
    public CountPrimesThread(int id){
        this.id = id;
    }
    
    @Override
    public void run(){
        
        long startTime = System.currentTimeMillis();
        int count = countPrimes(2, 10000);
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        System.out.println("Thread "+ id + " counted " + count +
                " primes in "+ (elapsedTime / 1000.0) + " seconds.");
        
    }
    
    private static boolean isPrime(int x){
        
        int top = (int) Math.sqrt(x);
        for(int i = 2; i <= top; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;        
    }
    
    private static int countPrimes(int min, int max){
        int count = 0;
        for (int i = min; i <= max; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    
    
}
public class TestPrime {
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int numberOfThreads = 0;
      while(numberOfThreads < 1 || numberOfThreads > 25){
          System.out.print("How many threads do you want to use (from 1 to 25) ? ");
          numberOfThreads = in.nextInt();
          if(numberOfThreads < 1 || numberOfThreads > 25){
              System.out.println("Please enter a number between 1 and 25 !");
          }
      }     
        System.out.println("\nCreating "+ numberOfThreads + " prime counting threads...");
        
        Thread[] worker = new Thread[numberOfThreads];
        
        for(int i = 0; i < numberOfThreads; i++){
            worker[i].start();
        }
        System.out.println("Threads have been created and started.");
      
    }
    

    
}
