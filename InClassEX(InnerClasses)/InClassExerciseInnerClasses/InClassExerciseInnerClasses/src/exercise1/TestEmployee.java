/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author pmage_000
 */
public class TestEmployee {
    public static void main(String[] args) {
        //create object of outer class
        Employee emp = new Employee(1000, "Joe Smith", "M", 3200);
        //create object of inner class
        Employee.Address addr = emp.new Address("30 Wynham Estate", "Dublin",24, "Ireland");
        //call method of inner class
        addr.printAll();
    }   
}


