package example2;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("This is an instance of class MyThread");
    }
}

public class TestExtends {

    public static void main(String args[]) {
        Thread threadA = new Thread(new MyThread(), "Thread A");
        Thread threadB = new Thread(new MyThread(), "Thread B");

        threadA.start();
        threadB.start();
        System.out.println("This is main method");
    }
}

    

