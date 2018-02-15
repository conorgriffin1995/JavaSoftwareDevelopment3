package exercise3;

import exercise1.*;

public class Busy implements Runnable {

    public void run() {

        System.out.println("Starting busy thread");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Busy...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ie) {
                System.out.println("Interrupted while busy sleeping");
            }
        }
        System.out.println("Finished busy thread");
    }

}

class TestBusy {

    public static void main(String[] args) {
        System.out.println("Main thread started");

        Busy bee = new Busy();

        Thread t1 = new Thread(bee);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace(System.out);
        }

        System.out.println("Ending main thread");
    }

}
