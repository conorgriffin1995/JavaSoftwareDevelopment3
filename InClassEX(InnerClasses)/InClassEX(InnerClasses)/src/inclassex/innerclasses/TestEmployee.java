/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassex.innerclasses;

/**
 *
 * @author x00111602
 */
public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee("1000","Joe Smith","M",3200.0);
        
        Employee.Address addr = emp.new Address("30 Wynham Estate","Dublin",24,"Ireland");
        
        addr.printall();
        
    }
            
    
}
