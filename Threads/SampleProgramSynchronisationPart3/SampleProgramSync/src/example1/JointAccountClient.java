package example1;

public class JointAccountClient implements Runnable {

    private double transaction;
    private JointAccount sa;

    public JointAccountClient(JointAccount sa) {
        this.sa = sa;
    }

    public void setTransaction(double transaction) {
        this.transaction = transaction;
    }

    @Override
    public void run() {
        sa.completeTransaction(transaction);
    }
}


