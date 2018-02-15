package sdev3lab13_Ex1to5;
import java.util.Comparator;

//conorgriffin x00111602
//Exercise 6

public class Employee {

    private String firstName;
    private String lastName;
    private int age;

    public Employee()
    {
        firstName="";
        lastName="";
        age=0;
    }
    
    public Employee(String f, String l, int a)
    {
        firstName = f;
        lastName = l;
        age=a;
        
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "First Name: " + firstName + "\t Last Name: " + lastName + "\t Age: \t" +age;
    }
    
    //Exercise 4
    public static Comparator<Employee> empNameComparator = new Comparator<Employee>(){
    @Override
    public int compare(Employee e1, Employee e2){
        
        String empName1 = e1.getLastName().toUpperCase();
        String empName2 = e2.getLastName().toUpperCase();
        
        return empName1.compareTo(empName2);
    
    } 
  };    
    
    //Exercise 3 
    class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        
        String empName1 = e1.getLastName().toUpperCase();
        String empName2 = e2.getLastName().toUpperCase();
        
        return empName1.compareTo(empName2);
    
    }  
       
 }
    
}


