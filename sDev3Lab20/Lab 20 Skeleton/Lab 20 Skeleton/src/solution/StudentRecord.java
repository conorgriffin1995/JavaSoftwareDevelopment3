package solution;


public class StudentRecord {

    private int studentNum;
    private String firstName;
    private String lastName;
    private double gpaValue;

    public StudentRecord() {
        this(0, "", "", 0.0);
    }

    public StudentRecord(int snum, String first, String last, double gpa) {
        studentNum = snum;
        firstName = first;
        lastName = last;
        gpaValue = gpa;
    }

    public void setSnum(int snum) {
        studentNum = snum;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public void setGpa(double gpa) {
        gpaValue = gpa;
    }

    public int getSnum() {
        return studentNum;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGpa() {
        return gpaValue;
    }

}
