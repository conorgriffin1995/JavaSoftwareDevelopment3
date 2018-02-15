package sdev3lab22;


public class CountPrimesThread implements Runnable {

    private int count;
    private int min, max;
    private static int total = 0;
    
    public CountPrimesThread(int min, int max){
        
        this.min = min;
        this.max = max;
        count = 0;
        
    }
    
    synchronized private static void addToTotal(int x){
        
        total = total + x;
        System.out.println(total+" primes found so far.");
        
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
        for(int i = min; i <= max; i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    
    public void run(){
        
        count = countPrimes(min, max);
        System.out.println("There are "+ count +" primes between "
        + min + " and " + max);
        addToTotal(count);
        
    }
    
}
