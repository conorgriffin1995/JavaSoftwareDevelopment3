package SerializationInClassEx;
import java.io.*;

public class TestLogin {
    
    private final String FILENAME = "files/login.dat";
    
    private void write() throws FileNotFoundException, IOException{
        
        Login l1 = new Login("user1","pass1");
        Login l2 = new Login("user2","pass2");
        
        try(FileOutputStream fo = new FileOutputStream(FILENAME);
                ObjectOutputStream oo = new ObjectOutputStream(
                        new BufferedOutputStream(fo))){
            
            oo.writeObject(l1);
            System.out.println("Login written:\t" + l1);
            oo.writeObject(l2);
            System.out.println("Login written:\t" + l2);
                       
        }
        
    }
    
    private void read() throws IOException, ClassNotFoundException{
        
        Login l;
        try(ObjectInputStream oi = new ObjectInputStream(
            new BufferedInputStream(new FileInputStream(FILENAME)))){
            
            try{
                while(true){
                    l = (Login) oi.readObject();
                    System.out.println("Login read:\t" + l);
                }
            } catch (EOFException e){
                System.out.println("EOF reached");
            }
        }
        
    }
    
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        
        TestLogin c = new TestLogin();
        c.write();
        c.read();
        
    }
           
}
