/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import ex1.*;

/**
 *
 * @author pmage_000
 */
public class CurrentAccount extends BankAccount {
    private int transactionCount;
    
    public CurrentAccount(double initbal) 
    {
     super(initbal);
     transactionCount = 0;
    }
    
    public void deposit(double amount) 
    { 
    	super.deposit(amount);
    	transactionCount++;
    }
 
    public String toString()
    {
    	return "Current account " +super.toString()+"\n No of Transactions on this acc:  " + transactionCount;
    } 
    
    public void deductFees()
    {
    	if(transactionCount >3)
    	{
    		double fees = .5*(transactionCount-3);
    		System.out.println("Current fee is " + fees);
    		super.withdraw(fees);   		
    	}
    }

    
}
