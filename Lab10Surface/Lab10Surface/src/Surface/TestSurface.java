

package Surface;
import java.util.ArrayList;
import java.util.Collections;

public class TestSurface {
    public static void main(String[] args) {
        
        ArrayList<Material> m1 = new ArrayList();
        m1.add(new Paint("Dulux Soft Sheen", 11.52, 2, 12));
        m1.add(new Paint("Crown White", 10.0, 3, 10));
        m1.add(new Wallpaper("Shand Kydd", 50, 10.06, 0.52));
        m1.add(new Flooring("Quick-Step Planked Oak", 65, 1.65));
        m1.add(new Flooring("Elka Classic Walnut", 80, 1.65));
    
    
    Surface testSurface = new Surface("testSurface", 5.7, 5.7);
    Collections.sort(m1, new SurfaceComparator());
    
    for(int i = 0; i < m1.size(); i++)
    {
        System.out.printf("\nName: %s, Requirements: %.2f units, Price: €%.2f",m1.get(i).getNameOfMaterial(),m1.get(i).getReqMaterial(testSurface),m1.get(i).calcTotalPrice(testSurface));       
    }
    
      
      
    
    }
}
