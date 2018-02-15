/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleBankAccount1;

/**
 *
 * @author pmage_000
 */
public class BankAccount {
    protected double balance; 

	public BankAccount()
	{ 
		balance = 0;
	}
	public BankAccount(double initialBalance)
	{ 
		balance = initialBalance;
	}

	public void deposit(double amount) 
	{ 
		balance = balance + amount;
	}
	public void withdraw(double amount) 
	{ 
		balance = balance - amount;
	}
	public double getBalance()
	{ 
		return balance; 
	}
    public String toString() 
    { 
        String formattedString = String.format("Balance is : €%,.2f", balance);
        return formattedString;
    }
    
}
