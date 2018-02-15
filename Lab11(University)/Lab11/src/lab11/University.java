package lab11;
import java.util.ArrayList;
/**
 *
 * @author x00111602
 */
public class University {
    
    private String uName;
    
    ArrayList <Department> depList = new ArrayList();
    
    public University(String uNameIn,int depID, String depNames)
    {
        this.uName = uNameIn;
        depList = new ArrayList();
        depList.add(new Department(depID, depNames));   
    }
    
    public String getUName()
    {
        return uName;
    }
    public void setUName(String uNameIn)
    {
        this.uName = uNameIn;
    }
    
    public void showList()
    {
        for(int i = 0; i < depList.size(); i++)
        {
            System.out.println(depList.get(i).getdepID() + " "+ depList.get(i).getdepName());
        }
    }
    
    
    
    
    class Department{
        
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
    
    public void changeDepName(String oldName, String newName)
    {
        for(int i = 0; i < depList.size(); i++)
        {
            if(depList.get(i).getdepName().equals(oldName))
            {
                depList.get(i).setdepName(newName);
            }
        }
    }
    
}

    
    

