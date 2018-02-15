/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author conorgriffin
 */
public class stockItem {
    
    private int ID;
    private String description;
    private int maximum; //maximum quantity you wish to have in stores of that stock item
    private int minimum; //minimum quantity is the amount you must have in stores
    private int inStock; //what you actually have in stock
    
    public stockItem(){
        
        this.ID = 0;
        this.description = "";
        this.maximum = 0;
        this.minimum = 0;
        this.inStock = 0;
        
    }
    
    public stockItem(int IDno, String desc, int max, int min, int inStockIn){
        
        ID = IDno;
        description = desc;
        maximum = max;
        minimum = min;
        inStock = inStockIn;
        
    }
    
    public void takeOnStock(int quantity){
    try{    
    if ((quantity + inStock) > maximum)
    {
        throw new OverMaxException();
    }
    else
    {
        inStock += quantity;
    }
    }catch(OverMaxException i){
        System.out.println(i.getMessage());
    }  
    }
    
    public void issueStock(int quanDeducted){
    try{    
        if (inStock - quanDeducted <= 0)
        {
            throw new OutOfStockException();
        }
        else if((inStock - quanDeducted) <= minimum){
            inStock = inStock - quanDeducted;
            throw new BelowMinException();        
        }
        else{
            inStock = inStock - quanDeducted;
            }
    }catch(OutOfStockException i)
        {
            System.out.println(i.getMessage());
        
    }catch(BelowMinException a)
        {
            System.out.println(a.getMessage());
        }   
        
        
    }
    
    public int getInStock(){      
        return inStock;
    }
    
    
}
