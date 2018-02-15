package example2;

public class TestProgram {

    public static void main(String[] args) {
        DataSet bankData = new DataSet();

        bankData.calculate(new CurrentAccount(1000));
        bankData.calculate(new SavingsAccount(5.5, 9000));
        bankData.calculate(new CurrentAccount(2000));

        System.out.printf("Average bank balance = €%,.2f%n", bankData.getAverage());

        System.out.printf("Highest bank balance = €%,.2f%n", bankData.getMaximum().balance);

    }
}
