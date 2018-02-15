/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleBankAccount2;



/**
 *
 * @author pmage_000
 */
public class TestBankAccount {
    public static void main(String args[])
    {
 
       SavingsAccount momsSavings 
             = new SavingsAccount(0.5, 10000.00);
       
       CurrentAccount peterscurrent
             = new CurrentAccount(100);
          
       momsSavings.deposit(10000);
       
       momsSavings.transfer(2000, peterscurrent);     
       peterscurrent.withdraw(1500);
       peterscurrent.withdraw(80);      
 
       momsSavings.transfer(1000, peterscurrent);
       peterscurrent.withdraw(400);      
 
       // Simulate end of month
       momsSavings.calcInterest();
       peterscurrent.deductFees();
       
       System.out.printf("Mom's savings balance = €%,.2f",
              momsSavings.getBalance());
 
       System.out.printf("%nHarry's checking balance = €%,.2f",
              peterscurrent.getBalance());
    }
    }

    

