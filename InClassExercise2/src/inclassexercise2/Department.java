package inclassexercise2;

/**
 *
 * @author x00111602
 */
public class Department {

    private int depID;
    private String depName;
    
    public Department (int depID, String depName){
        
        this.depID=depID;
        this.depName=depName;
        
    }
    
    public int getdepID(){
        return depID;
        
    }
    public String getdepName(){
        return depName;
        
    }
    public void setdepID(int depIDin){
        this.depID = depIDin;
    }
    public void setdepName(String depNameIn){
        this.depName = depNameIn;
    }
    
}
