package inclassex.innerclasses;

/**
 *
 * @author x00111602
 */
public class Outside {
    
    private int x;
    
    public Outside(int x){
        this.x = x;
    }
    
    
    class Inside{
        
        private int y;

        public Inside(int y) {
            this.y = y;
        }
        
        public void add(){
            System.out.println("Addition: "+ (x+y));
        }
        
        public void multiply(){
            Inside i = new Inside(5);
            System.out.println("Multiplication: "+ (x*i.y));
            i.add();
        }
        
    }
}
