package example4;

public class FullTime extends Employee {

    private double salary;

    public FullTime(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Salaried \t ";
    }

    @Override
    public double getMeasure() {
        return salary;
    }

}
