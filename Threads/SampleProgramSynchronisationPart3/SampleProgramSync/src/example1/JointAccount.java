package example1;

public class JointAccount {

    private double balance;

    public JointAccount(double initialAmount) {
        balance = initialAmount;
    }

    public synchronized void completeTransaction(double amount) {
        double temp = this.balance + amount;

        if (amount < 0) {
            System.out.println("Withdrawing: " + amount);
        } else {
            System.out.println("Depositing: " + amount);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Transaction interrupted.");
        }

        balance = temp;
        System.out.println("Current Balance: " + balance);
    }
}




