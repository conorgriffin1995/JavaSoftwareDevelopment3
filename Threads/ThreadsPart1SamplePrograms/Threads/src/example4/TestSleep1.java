package example4;

class MyThread1 implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread());

    }
}

public class TestSleep1 {

    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread1(), "threadA");
        Thread threadB = new Thread(new MyThread1(), "threadB");

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
