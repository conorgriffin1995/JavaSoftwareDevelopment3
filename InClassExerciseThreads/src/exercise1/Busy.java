package exercise1;

public class Busy implements Runnable {

    public void run() {

        System.out.println("Starting busy thread");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Busy...");

        }
        System.out.println("Finished busy thread");
    }

}

class TestBusy {

    public static void main(String[] args) {
        System.out.println("Main thread started");

        Busy bee = new Busy();

        Thread t1 = new Thread(bee);

        t1.start();

        System.out.println("Ending main thread");
    }

}
