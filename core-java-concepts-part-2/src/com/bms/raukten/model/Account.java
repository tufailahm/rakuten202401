package com.bms.raukten.model;

public class Account {
	int accountNumber;
	String customerName;
	int balance=1000;
	{
		System.out.println("1. ACC INITITALIZER");
	}

	public Account() {
		System.out.println("2. Account parent def cons called");
	}

	public Completed changePin() {
		System.out.println("6. Changing PIN for account");
		return null;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("ACCOUNT FINALIZE CALLED");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Account(int accountNumber, String customerName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

}
