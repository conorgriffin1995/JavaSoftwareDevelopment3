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
public class Rectangle implements IShape{
    
    private double width;
    private double length;
    
    public Rectangle(double widthIn, double lengthIn)
    {
        this.width = widthIn;
        this.length = lengthIn;
    }
    
    @Override
    public double getArea()
    {
        return this.width * this.length;
    }
    
    public String toString()
    {
        return "Rectangle (1 = "+length+ ", w = "+width+")";
    }
}
