package sdev3lab4;

import java.util.ArrayList;

/**
 *
 * @Conor Griffin x00111602
 */
public class TestShape {

    public static void main(String[] args) {

        ArrayList<Shape> Shape = new ArrayList();

        Shape.add(new Rectangle(4.0, 5.0, "Red", "Rectangle"));
        Shape.add(new Triangle(4.0, 5.0, "Black", "Triangle"));
        Shape.add(new Circle(9.0, "Black", "Circle"));
        Shape.add(new Cylinder(9.0, 5.0, "Indigo", "Cylinder"));

        for (int i = 0; i < Shape.size(); i++) {
            System.out.println("--------------------------------------");
            System.out.println("Shape: " + (i + 1));
            Shape.get(i).print();
            System.out.printf("Area is: \t%.2f", Shape.get(i).calcArea());
            System.out.println();
        }

        /*for(int i = 0; i < Shape.size(); i++)
        {
            
         if(Shape.get(i) instanceof .calcVolume())
         {
            Shape.get(i).calcVolume();
         }
        }
         */
    }

}
