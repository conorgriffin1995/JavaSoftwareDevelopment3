package example3;

public class NegativeInterestRate extends Exception{
    public NegativeInterestRate() {
        super("Error: Negative Interest Rate");
    }
    public NegativeInterestRate(double rate) {
        super("Error: Negative Interest Rate: " + rate);
    }
}


