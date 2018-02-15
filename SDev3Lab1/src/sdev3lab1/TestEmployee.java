package sdev3lab1;

/**
 *
 * @author x00111602
 */
public class TestEmployee {
    
    public static void main(String args[])
    {
        Engineer e1 = new Engineer(101, "Jane Smith", "2378675D", 120345.27);
        Admin a1 = new Admin(304, "Bill Munroe", "09778654V", 75002.34);
        Manager m1 = new Manager("European Marketing", 207, "Barbara Johnson", "8765667Y", 109501.36);
        Director d1 = new Director(1000000.00, "Global Marketing", 122, "Susan Wheeler", "9876547B",120567.36);
        
        e1.print();
        System.out.println("-------------------- ");
        a1.print();
        System.out.println("-------------------- ");
        m1.print();
        System.out.println("-------------------- ");
        d1.print();
        
        
        m1.raiseSalary(10000.00);
        m1.setName("Barbara Johnson-Smyth");
        m1.print();
    }
    
}
