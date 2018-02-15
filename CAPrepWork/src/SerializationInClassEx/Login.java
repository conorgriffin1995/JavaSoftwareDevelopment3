package SerializationInClassEx;

import java.io.*;

public class Login implements Serializable {
    
    private String Username;
    private transient String Password;
    
    public Login(){
        
        this.Password = Password;
        this.Username = Username;
        
    }
    
    public Login(String u, String p){
        
        Username = u;
        Password = p;
               
    }
    
    public String toString(){
        
        if(Password == null)
        {
            Password = "n/a";            
        }
        
        return("Username: "+Username+"Password: "+Password);
        
    }
    
}
