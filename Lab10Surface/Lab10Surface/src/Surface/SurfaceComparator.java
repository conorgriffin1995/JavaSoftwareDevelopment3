
package Surface;

import java.util.Comparator;
public class SurfaceComparator implements Comparator<Material> {


    //@Override
    public int compare(Material m1,Material m2) {
        String name1 = m1.getNameOfMaterial().toUpperCase();
        String name2 = m2.getNameOfMaterial().toUpperCase();

	//ascending order
        return name1.compareTo(name2);
    }
}
