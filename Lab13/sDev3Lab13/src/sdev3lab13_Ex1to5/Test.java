package sdev3lab13_Ex1to5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author x00111602
 */
public class Test {
    
    public static void main(String[] args) {
        ArrayList<Employee> persons = new ArrayList();
        
        persons.add(new Employee("Tony", "Collins", 18));
        persons.add(new Employee("Noel", "Brady  ", 69));
        persons.add(new Employee("John", "Donnell", 34));
        persons.add(new Employee("Jim ", "Greally", 16));
        
        //Exercise1
        Collections.sort(persons, new AgeComparator());
        for(int i = 0; i < persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
        
        System.out.println("");
        
        //Exercise2
        Collections.sort(persons, new NameComparator());
        for(int i = 0; i < persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
        System.out.println("");
        
        //Exercise3
        Collections.sort(persons, new Employee().new MyComparator());
        for(int i = 0; i < persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
        System.out.println("");
        
        //Exercise4
        Collections.sort(persons, Employee.empNameComparator);
        for(int i = 0; i < persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
        
        System.out.println("");
        
        //Exercise5
        Collections.sort(persons, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee emp1, Employee emp2)
            {
                return emp1.getLastName().compareTo(emp2.getLastName());
            }
        
        });
        for(int i = 0; i < persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
        System.out.println("");
        
        
    }
    
}
