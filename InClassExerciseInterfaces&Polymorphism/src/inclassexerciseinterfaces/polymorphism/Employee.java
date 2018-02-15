package inclassexerciseinterfaces.polymorphism;

/**
 *
 * @author x00111602
 */
public abstract class Employee implements IPayable {

    private String fName;
    private String lname;
    private String rsiNumber;

    private static int numEmps = 0;

    public Employee(String fName, String lname, String rsiNumber) {
        this.fName = fName;
        this.lname = lname;
        this.rsiNumber = rsiNumber;
        
        numEmps++;
    }
    
    public static int getNumEmps()
    {
        return numEmps;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRsiNumber() {
        return rsiNumber;
    }

    public void setRsiNumber(String rsiNumber) {
        this.rsiNumber = rsiNumber;
    }

    @Override
    public String toString() {
        return "Employee:" +"\n"+
                "First Name='" + fName + '\'' +"\n"+
                "Last Name='" + lname + '\'' +"\n"+
                "RSI Number='" + rsiNumber + '\'' +"\n";
    }
    
    
}
