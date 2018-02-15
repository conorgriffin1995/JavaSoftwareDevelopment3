/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author pmage_000
 */
public class TestDefault {
    public static void main(String[] args) {
        Outer o = new Outer("Outer String");
        
        System.out.println("Outer: "+o.getoString());
        
        Outer.Inner i = o.new Inner("Inner String");
        
        System.out.println("Inner: "+i.getiString());
    }
}
