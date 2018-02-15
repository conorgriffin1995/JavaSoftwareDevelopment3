package example1;

public class JointAccountTest {

    public static void main(String[] args) {
        JointAccount sa = new JointAccount(400.00);
        JointAccountClient john = new JointAccountClient(sa);
        JointAccountClient mary = new JointAccountClient(sa);
        double x1 = 1000.00;
        double x2 = -400;

        john.setTransaction(x1);
        mary.setTransaction(x2);

        Thread t1 = new Thread(john);
        Thread t2 = new Thread(mary);
        t1.start();
        t2.start();
    }
}




