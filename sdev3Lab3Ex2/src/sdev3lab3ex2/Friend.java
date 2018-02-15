package sdev3lab3ex2;

/**
 *
 * @aConor Griffin x00111602
 */
public class Friend {

    private String name;
    private String phoneNum;
    
    public Friend(){
        name = "";
        phoneNum = "";
    }
    public Friend(String nameIn, String phoneNumIn){
        name = nameIn;
        phoneNum = phoneNumIn;
    }
    //Getter
    public String getName(){
        
        return name;
    }
    public String getPhoneNum(){
        
        return phoneNum;
    }
    //Setter
    public void setName(String nameIn){
        this.name = nameIn;
        
    }
    public void setPhoneNum(String phoneNumIn){
        this.phoneNum = phoneNumIn;
        
    }
    public String toString(){
        return "\tName : " + this.name 
                + "\t Phone Number : " + this.phoneNum;
    }
    
}
