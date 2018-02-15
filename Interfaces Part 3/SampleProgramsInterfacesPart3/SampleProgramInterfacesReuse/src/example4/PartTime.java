package example4;

public class PartTime extends Employee {

    private double rate;
    private double hours;

    public PartTime(String name, double rate, double hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double pay() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Hourly \t ";
    }

    @Override
    public double getMeasure() {
        return rate * hours;
    }

}
