/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3private;

public class Outer {
    
    private String oString;
    
    
    public Outer(String oString)
    {
        this.oString = oString;
    }
    public String getoString()
    {
        return oString;
    }
    
    private class Inner {
        private String iString;
        
        public Inner(String iString)
        {
            this.iString = iString;
        }
        public String getiString()
        {
            return iString;
        }
    }
          
    
}
