/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3private;

/**
 *
 * @author pmage_000
 */
public class TestPrivate {
    public static void main(String[] args) {
        exercise3private.Outer o = new exercise3private.Outer("Outer String");
        
        System.out.println("Outer: "+o.getoString());
        
        exercise3private.Outer.Inner i = o.new Inner("Inner String");
        
        System.out.println("Inner: "+i.getiString());
    }
    
}
