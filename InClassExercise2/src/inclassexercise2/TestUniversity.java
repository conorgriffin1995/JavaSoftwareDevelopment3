package inclassexercise2;

/**
 *
 * @author x00111602
 */
public class TestUniversity {
    
    public static void main(String[] args) {
        int[] depIDs = {1,2,3,4};
        String[] depNames = {"Computing","Business","Languages","Engineering"};
        
        
        University u = new University("DCU",depIDs,depNames);
        u.showList();
        System.out.println();
        u.changeDepName("Business","Business & Marketing");
        u.showList();
        
    }
    
}
