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
public class Pizza {
    
    private double price;
    
    private IShape shape;
    
    public Pizza(double price, IShape s)
    {
        this.price = price;
        this.shape = s;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public IShape getShape()
    {
        return this.shape;
    }
    
    @Override
    public String toString()
    {
        return "€"+price+" "+getShape();       
    }        
}
