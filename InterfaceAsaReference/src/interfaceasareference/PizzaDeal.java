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
public class PizzaDeal {
    
    public double deal(Pizza p)
    {
        return p.getPrice() / p.getShape().getArea();
    }
    
    public boolean betterDeal(Pizza p1, Pizza p2)
    {
        return deal(p1) < deal(p2);
    }
}
