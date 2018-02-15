/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab13_Ex1to5;

import java.util.Comparator;

/**
 *
 * @author conorgriffin
 */

//Exercise 2
public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        
        String empName1 = e1.getLastName().toUpperCase();
        String empName2 = e2.getLastName().toUpperCase();
        
        return empName1.compareTo(empName2);
    
}
    
}
