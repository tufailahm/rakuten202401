package com.bms.raukten.client;

import com.bms.raukten.model.Account;
import com.bms.raukten.model.CurrentAccount;
import com.bms.raukten.model.SavingsAccount;

public class Client {
	
	public static void main(String[] args) {
		//Way 1 
		/*
		 * System.out.println("way 1"); SavingsAccount savingsAccount = new
		 * SavingsAccount(); savingsAccount.changePin();
		 * 
		 * CurrentAccount currentAccount = new CurrentAccount();
		 * currentAccount.changePin();
		 */
		
		
		
		//Way2 
		System.out.println("way 2");
		Account account = new SavingsAccount();
		account.changePin();
		account = new CurrentAccount();
		account.changePin();
		
		SavingsAccount sc1 = new SavingsAccount();
		CurrentAccount c1 = new CurrentAccount();
		c1 = new CurrentAccount();
		
		sc1 = null;
		
		System.gc();
		
	}
}