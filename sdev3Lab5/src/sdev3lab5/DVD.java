package sdev3lab5;

/**
 *
 * @author x00111602
 */
public class DVD {

        private String title;
        private String director;
        private double cost;
        
        public DVD(){
            cost = 0.0;
            title = "";
            director = "";
            
        }
        public DVD(double costIn, String titleIn, String directorIn){
            cost = costIn;
            title = titleIn;
            director = directorIn;
            ;
        }
        public String toString(){
        return    "\nCost: €" + this.cost 
                + "\nTitle: " + this.title 
                + "\nDirector: " + this.director
                + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        
                
    }
}
