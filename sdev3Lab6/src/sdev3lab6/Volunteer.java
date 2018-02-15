package sdev3lab6;

/**
 *
 * @author x00111602
 */
public class Volunteer extends StaffMember {
    
    public Volunteer(String nameIn, String addressIn, String phoneNumIn)
    {
        super(nameIn,addressIn,phoneNumIn);
    }
    
    @Override
    public double pay(){
        
        return 0;
    }
    
}
