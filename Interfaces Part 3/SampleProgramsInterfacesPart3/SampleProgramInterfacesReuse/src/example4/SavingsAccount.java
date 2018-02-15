package example4;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double rate, double initbal) {
        super(initbal);
        interestRate = rate;
    }

    public void calcInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Interest Rate : " + interestRate);
    }

}
