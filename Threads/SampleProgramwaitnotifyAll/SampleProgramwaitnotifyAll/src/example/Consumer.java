package example;

import java.util.ArrayList;

class Consumer implements Runnable {

    private final ArrayList<Integer> taskQueue;

    public Consumer(ArrayList<Integer> sharedQueue) {
        this.taskQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            consume();
        }
    }

    private void consume() {
        {
            synchronized (taskQueue) {
                while (taskQueue.isEmpty()) {
                    System.out.println("Queue is empty " 
                            + Thread.currentThread().getName() 
                            + " is waiting , size: " + taskQueue.size());

                    try {
                        taskQueue.wait();
                    } catch (InterruptedException ex) {

                    }
                }
                try {
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
