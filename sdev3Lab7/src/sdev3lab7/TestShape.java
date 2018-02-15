package sdev3lab7;

/**
 *
 * @ConorGriffin x00111602
 */
public class TestShape {
    
    public static void main(String[] args) {
       
        Shape [] shapes;
        double min = 0;
        double max = 0;
        int minShape = 0;
        int maxShape = 0;

        
        double total = 0.0;
        
        shapes = new Shape[]{
            new Circle(22,88,4),
            new Square(71,96,10),
            new Sphere(8,89,2),
            new Cube(79,61,8)};
        
        Paint p1 = new Paint(70);
        
        for (int i = 0; i < shapes.length; i++){
            
            System.out.println("");
            System.out.print(shapes[i].getName());
            System.out.println(shapes[i].toString());
            
            
            if(shapes[i] instanceof Circle)
            {
                Circle c = (Circle) shapes[i];
                System.out.println("Area of "+c.getName()+" is: "+c.getArea());
                
                
            }
            if(shapes[i] instanceof Square)
            {
                Square s = (Square) shapes[i];
                System.out.println("Area of "+s.getName()+" is: "+s.getArea());
               
                
            }
            if(shapes[i] instanceof Sphere)
            {
                Sphere sp = (Sphere) shapes[i];
                System.out.println("Area of "+sp.getName()+" is: "+sp.getArea());
                System.out.println("Volume of "+sp.getName()+" is: "+sp.getVolume());
                
                
            }
            if(shapes[i] instanceof Cube)
            {
                Cube cu = (Cube) shapes[i];
                System.out.println("Area of "+cu.getName()+" is: "+cu.getArea());
                System.out.println("Volume of "+cu.getName()+" is: "+cu.getVolume());
               
                
            }
            p1.calcAmount(shapes[i]);
            total += p1.calcAmount(shapes[i]);
            System.out.println();
            
            if(p1.calcAmount(shapes[i])<max)
            {
                minShape = i;
            }
            if(p1.calcAmount(shapes[i]) > min)
            {
                maxShape = i;
            }
            
            System.out.printf("Amount of paint needed for "+shapes[i].getName()+ " is: %.2f litres",p1.calcAmount(shapes[i]),"litres");
            System.out.println();
            
        }
        
        System.out.println();
        System.out.printf("Total amount of paint required is: %.2f litres",total);
        System.out.println("\nThe name of the shape that requires the most paint is: "+shapes[maxShape].getName());
        System.out.println("The name of the shape that requires the least paint is: "+shapes[minShape].getName());
        System.out.println("Total number of shapes created is: "+Shape.getPaint());   
    }
          
}
