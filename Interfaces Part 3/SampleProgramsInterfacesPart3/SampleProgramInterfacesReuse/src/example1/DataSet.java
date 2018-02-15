package example1;

public class DataSet {

    private double sum;
    private double maximum;
    private int count;

    /* Constructs an empty data set. */
    public DataSet() {
        sum = 0;
        count = 0;
        maximum = Double.MIN_VALUE;
    }

    /* Adds a data value to the data set and determines the max */
    public void calculate(double x) {
        sum = sum + x;
        if (x > maximum) {
            maximum = x;
        }
        count++;
    }
    /* Gets the average of the added data. */

    public double getAverage() {
        return sum / count;
    }

    public double getMaximum() {
        return maximum;
    }
}




