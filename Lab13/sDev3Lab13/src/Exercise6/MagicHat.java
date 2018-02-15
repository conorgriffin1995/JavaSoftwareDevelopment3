package Exercise6;
import java.util.Random;

//conorgriffin x00111602
//Exercise 6

public class MagicHat {
    
    private String hatName;
    private Rabbit[] rabbits;
    private static int maxNumRabbits = 5;
    private static int numRabbits; 
    
    public MagicHat(final String hatName){
        this.hatName = hatName;
        numRabbits = (int)(1 + Math.random() * maxNumRabbits);
        rabbits = new Rabbit[numRabbits];
        
        for(int i = 0; i < rabbits.length; i++){
            rabbits[i] = new Rabbit();
        }
        
    }
    
    @Override
    public String toString(){
        String hatString = "\n" + hatName + " contains:\n";
        
        for(int i = 0; i < rabbits.length; i++)
        {
            hatString += "\t" + rabbits[i] + " ";
        }
        
        return hatString;
    }
    
    
    
    static class Rabbit{
        
        private static String [] rabbitNames = {"Leo", "Fred", "Joe", "Jack"};
        private static int [] rabbitNamesCount = new int [rabbitNames.length];
        private String name;
        
        public Rabbit()
        {
        int index = (int)(Math.random() * rabbitNames.length);
        name = rabbitNames[index] + (++rabbitNamesCount[index]);
        }
        @Override
        public String toString()
        {
            return name;
        }
        
        
        
    }
    
    
    
}
