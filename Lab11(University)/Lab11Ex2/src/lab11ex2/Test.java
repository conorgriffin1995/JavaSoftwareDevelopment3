package lab11ex2;
import java.util.Scanner;
/**
 *
 * @author conorgriffin
 */
public class Test {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String manufacturer;
        int totalMemCap;
        int numModules = 0;
        int [] memoryModules = new int[numModules];
        
        
        System.out.print("Enter Manufacturer: ");
        manufacturer = in.nextLine();
        System.out.print("Enter memory size: ");
        totalMemCap = in.nextInt();
        System.out.print("Enter number of memory modules: ");
        numModules = in.nextInt();

        Motherboard m = new Motherboard(manufacturer,totalMemCap,numModules);
        
        System.out.println(m.toString());
        
        int size = 0;
        for(int i = 0; i < numModules; i++)
        {
            
            size = totalMemCap/numModules;
            System.out.println("module "+(i+1)+" size: "+size+"MB");
           
            
        }
        
        
    }
    
}
