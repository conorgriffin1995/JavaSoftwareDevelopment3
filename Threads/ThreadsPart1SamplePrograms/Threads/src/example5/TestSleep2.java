package example5;

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() + " i is " + i);
            try {
                Thread.currentThread();
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}

public class TestSleep2 {

    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread2(), "threadA");
        Thread threadB = new Thread(new MyThread2(), "threadB");

        threadA.start();
        threadB.start();

        try {// delay for one second
            Thread.currentThread();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        // Display info about the main thread
        System.out.println(Thread.currentThread());
    }
}


