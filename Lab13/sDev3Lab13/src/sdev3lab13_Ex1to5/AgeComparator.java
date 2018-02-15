package sdev3lab13_Ex1to5;
import java.util.Comparator;

/**
 *
 * @author x00111602
 */ 

//Exercise1
    public class AgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
      int emp1 = e1.getAge();
      int emp2 = e2.getAge();     
        
      return e2.getAge() - e1.getAge();
        
        
        
    }
    
}
