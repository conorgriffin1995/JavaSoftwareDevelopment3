package example4;

public class TestProgram {

    public static void main(String[] args) {
        DataSet bankData = new DataSet();

        bankData.calculate(new CurrentAccount(1000));
        bankData.calculate(new SavingsAccount(5.5, 9000));
        bankData.calculate(new CurrentAccount(2000));

        System.out.printf("Average bank balance = €%,.2f%n", bankData.getAverage());
        Measurable max = bankData.getMaximum();
        System.out.printf("Highest bank balance = €%,.2f%n", max.getMeasure());

        DataSet empData = new DataSet();

        empData.calculate(new FullTime("John", 50000));
        empData.calculate(new PartTime("Paddy", 30.0, 40.0));
        empData.calculate(new FullTime("Nick", 90000));

        System.out.printf("Average pay = €%,.2f%n", empData.getAverage());
        max = empData.getMaximum();
        System.out.printf("Highest pay value = €%,.2f", max.getMeasure());
        System.out.println();
    }
}
