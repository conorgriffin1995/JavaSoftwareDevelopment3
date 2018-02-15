/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author pmage_000
 */
public class TestBankAccount {
    public static void main(String args[])
    {
		SavingsAccount s = new SavingsAccount(10,100);
		s.deposit(5000);
		s.print();
		s.calcInterest();
		s.print();
		s.withdraw(4500);
		s.print();
		
		CurrentAccount c = new CurrentAccount(1500);
		c.deposit(400);
		c.print();
		c.deposit(600);
		c.print();
		c.deposit(600);
		c.print();
		c.deposit(600);
		c.print();
		c.deductFees();
		c.print();
    }
    
}
