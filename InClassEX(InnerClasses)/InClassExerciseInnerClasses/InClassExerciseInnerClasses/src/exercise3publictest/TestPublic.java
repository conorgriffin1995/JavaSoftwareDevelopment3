/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3publictest;

import exercise3public.Outer.Inner;

public class TestPublic {
     public static void main(String[] args) {
        exercise3public.Outer o = new exercise3public.Outer("Outer String");
        
        System.out.println("Outer: "+o.getoString());
        
        exercise3public.Outer.Inner i = o.new Inner("Inner String");
        
        System.out.println("Inner: "+i.getiString());
    }
    
}
