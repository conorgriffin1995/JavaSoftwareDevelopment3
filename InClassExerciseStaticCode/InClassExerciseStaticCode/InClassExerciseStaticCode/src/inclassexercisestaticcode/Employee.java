package inclassexercisestaticcode;

public abstract class Employee {

    private String name;
    private static int empCount = 0;

    public Employee(String name) {
        this.name = name;
        empCount++;
    }
    
    public static int getCount(){
        return empCount;
    }
    
    public void resign(){
        empCount--;
    }
    
    public abstract double pay();

    public abstract void sickpay();

    @Override
    public String toString() {
        return "Name is " + name;
    }

}
