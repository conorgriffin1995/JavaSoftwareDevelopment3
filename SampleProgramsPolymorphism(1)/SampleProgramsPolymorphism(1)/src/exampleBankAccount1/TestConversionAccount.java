/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleBankAccount1;

/**
 *
 * @author pmagee
 */
public class TestConversionAccount {
     public static void main(String args[])
    {
        CurrentAccount c1 = new CurrentAccount(1500);
        
        // Widening Conversion
        BankAccount b = c1;
        System.out.println("Balance:"+b.balance);
        
        // Narrowing Conversion
        BankAccount b1 = new SavingsAccount(5.5,2000);
        // Narrowing Conversion
        if (b1 instanceof SavingsAccount)
        {
            SavingsAccount s1 = (SavingsAccount) b1;  
            System.out.println("Balance:"+s1.balance);
        }
        
    }
    
}
