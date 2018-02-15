package inclassexercise2;

/**
 *
 * @author x00111602
 */
public class University {
    
    private String uName;
    private Department[] depList;
    
    public University(String uNameIn, int[] depID, String[] depNames)
    {
        this.uName = uNameIn;
        depList = new Department[depID.length];
        
        for(int i = 0; i < depList.length; i++)
        {
            depList[i] = new Department(depID[i], depNames[i]);
        }
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
        for(int i = 0; i < depList.length; i++)
        {
            System.out.println(depList[i].getdepID() + " "
                             + depList[i].getdepName());
        }
    }
    
    //Change Name Method
    public void changeDepName(String old, String newName)
    {
        for (int i = 0; i < depList.length; i++)
        {
            if (depList[i].getdepName().equals(old))
            {
                depList[i].setdepName(newName);
            }
        }
    }
    
}
