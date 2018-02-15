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
public class Circle implements IShape {

    private double radius;
    
    public Circle(double radiusIn)
    {
        this.radius = radiusIn;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public String toString()
    {
        return "Circle(radius = "+radius+")";
    }
}
