package example2;


public class DataSet {
	private double sum;
	private int count;
	private BankAccount maximum;

	public DataSet() {
		sum = 0;
		count = 0;
	}
	public void calculate(BankAccount x) {
		sum = sum + x.balance;
		if (count ==0 || x.balance > maximum.balance) {
			maximum = x;
		}
		count++;
	}

	public BankAccount getMaximum() {
		return maximum;
	}

	public double getAverage() {
		return (sum / count);
	}
}




