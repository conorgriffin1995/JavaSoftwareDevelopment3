package example;

import java.util.ArrayList;

class Producer implements Runnable {

    private final ArrayList<Integer> taskQueue;
    private final int MAX_CAPACITY;

    public Producer(ArrayList<Integer> sharedQueue, int size) {
        this.taskQueue = sharedQueue;
        this.MAX_CAPACITY = size;
    }

    @Override
    public void run() {
        int counter = 0;

        while (true) {
            produce(counter++);
        }
    }

    private void produce(int i) {
        {
            synchronized (taskQueue) {
                while (taskQueue.size() == MAX_CAPACITY) {
                    System.out.println("Queue is full " 
                            + Thread.currentThread().getName() + 
                            " is waiting , size: " + taskQueue.size());
                    try {
                        taskQueue.wait();
                    } catch (InterruptedException ex) {
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                taskQueue.add(i);
                System.out.println("Produced: " + i);
                taskQueue.notifyAll();
            }
        }
    }
}
