package sdev3lab5;

/**
 *
 * Conor Griffin x00111602
 */
public class TestDVDCollection {
    
    public static void main(String[] args) {
        
        DVDCollectionClass newCollection = new DVDCollectionClass();
        
        newCollection.addDVD(25.95, "The Walk", "Robert Zemeckis");
        newCollection.addDVD(24.95, "Trainwreck", "Jude Apatow");
        newCollection.addDVD(27.95, "No Escape", "John Erick Dowdle");
        newCollection.addDVD(13.90, "Paper Towns", "Jake Schreier");
        
        newCollection.addDVD(39.99, "Captive", "Jerry Jameson");
        newCollection.addDVD(15.95, "Minions", "Kyle Balda");
        
        System.out.println(newCollection.toString());
        
        
        
    }
    
}
