package example3;

public class DataSet {

    private double sum;
    private int count;
    private Employee maximum;

    public DataSet() {
        sum = 0;
        count = 0;
    }

    public void calculate(Employee e) {
        sum = sum + e.pay();
        if (count == 0 || e.pay() > maximum.pay()) {
            maximum = e;
        }
        count++;
    }

    public Employee getMaximum() {
        return maximum;
    }

    public double getAverage() {
        return (sum / count);
    }
}




