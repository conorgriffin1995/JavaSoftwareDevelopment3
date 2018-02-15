package sdev3lab5;

/**
 *
 * Conor Griffin x00111602
 */
public class DVDCollectionClass {
    
    private int count;
    private double totalCost;
    private DVD[] dvds;
    
    public DVDCollectionClass(){
        count = 0;
        totalCost = 0;
        dvds = new DVD [4];
    }
        
    public void addDVD(double costIn, String titleIn, String directorIn){
        if(count == dvds.length)
        {
            increaseCapacity();
        }
        dvds[count] = new DVD (costIn, titleIn, directorIn);
        totalCost += costIn;
        count++;
         
        
    }
    
    @Override
    public String toString(){
        
        double average = totalCost/count;
        String s = "My DVD Collection \n\nNumber of DVDs :"+count+ "\nTotal Cost : €"+totalCost+"\nAverage Cost : €"+average+"\n\nDVD List:\n";
        for (int i = 0; i < count; i++)
        {
            s+= (dvds[i].toString());
        }
        return s;
    }
    
    //Increasing Array
    public void increaseCapacity(){
        DVD [] dvds2 = new DVD[(dvds.length*2)];
        
        for(int i = 0; i < dvds.length; i++)
        {
            
        dvds2[i] = dvds[i];
        
        }
        dvds = dvds2;
    }
    
     
}


