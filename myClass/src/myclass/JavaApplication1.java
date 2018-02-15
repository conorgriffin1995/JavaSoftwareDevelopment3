package myclass;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables

        File pathToBinary = new File("Macintosh HD\\Applications\\Firefox\\firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();       
        WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);


        //WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://gmail.com/";
        String expectedTitle = "Gmail";
        String actualTitle = "";
 
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
 
        // get the actual value of the title
        actualTitle = driver.getTitle();
 
        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //close Firefox
        driver.close();
        
        // exit the program explicitly
        System.exit(0);
    }
    
}
