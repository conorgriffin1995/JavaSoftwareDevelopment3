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
public class SavingsAccount extends CurrentAccount{
    private double interestRate;

  	public SavingsAccount(double rate, double initbal)
  	{
    	 super(initbal); 
		 interestRate = rate;		
  	}

  	public void calcInterest()
  	{
    		double interest = getBalance() * interestRate / 100;
    		deposit(interest);
    }
  	public String toString() 
    { 
  		return "Savings account " + super.toString() + "\n Interest Rate : " + interestRate;
    }	
    
}
