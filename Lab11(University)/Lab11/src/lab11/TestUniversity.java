/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;

/**
 *
 * @author x00111602
 */
public class TestUniversity {
    
    public static void main(String[] args) {
        
        int [] depIDs = {1001,1002,1003,1004};
        String [] depNames = {"Computing","Business","Languages","Engineering"};
        
        University  uni [] = new University[depIDs.length];
        
        for(int i = 0; i < depIDs.length; i++)
        {
            uni[i] = new University("DCU",depIDs[i],depNames[i]);
            uni[i].showList();
        }
        System.out.println("");
        
        for(int i = 0; i < depIDs.length; i++)
        {
            uni[i].changeDepName("Business","Business & Marketing");
            uni[i].showList();
        } 
    }
    
}
