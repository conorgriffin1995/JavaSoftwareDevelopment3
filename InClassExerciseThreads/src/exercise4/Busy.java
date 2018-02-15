package exercise4;

import exercise1.*;

public class Busy implements Runnable {
    
    private String name;
    
    public Busy(String name){
        
        this.name = name;
        
    }
    @Override
    public void run() {

        System.out.println("Starting busy thread");
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + " is busy...");
            try{
                Thread.sleep(10);
            }catch(InterruptedException ie){
                System.out.println("Interrupted while busy sleeping");
            }
        }
        System.out.println("Finished busy thread");
    }

}

class TestBusy {

    public static void main(String[] args) {
        System.out.println("Main thread started");

        Busy bee1 = new Busy("Harry");
        Busy bee2 = new Busy("Sally");

        Thread t1 = new Thread(bee1);
        Thread t2 = new Thread(bee2);
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace(System.out);
        }

        System.out.println("Ending main thread");
    }

}
