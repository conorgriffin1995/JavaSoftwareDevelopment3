/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceasareference;

/**
 *
 * @author x00111602
 */
public class PizzaClient {
    public static void main(String[] args) {
        
        Pizza round = new Pizza(3, 99, new Circle(2.5));
        Pizza rec = new Pizza(4, 99, new Rectangle(4,6));
        
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round + " is a better deal than "+rec+ ": "+
                           pd.betterDeal(round, rec));
        
    }
    
}
