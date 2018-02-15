package sdev3lab6;

/**
 *
 * @author x00111602
 */
public abstract class StaffMember
{
    
    protected String name;
    protected String address;
    protected String phoneNum;
    
    public StaffMember()
    {
        name = "";
        address = "";
        phoneNum = "";
    }
    
    public StaffMember(String nameIn, String addressIn, String phoneNumIn)
    {
        name = nameIn;
        address = addressIn;
        phoneNum = phoneNumIn;
    }
    
   
    public String toString()
    {
        return "\nName : "+name+"\nAddress : "+address+"\nPhone : "+phoneNum;
    }
    
    public abstract double pay();
}

