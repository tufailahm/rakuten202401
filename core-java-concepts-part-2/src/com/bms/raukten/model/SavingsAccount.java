package com.bms.raukten.model;

public class SavingsAccount extends Account implements Rewards,Perks{

	int minimumBalance;
	int balance = 5000;
	{
		System.out.println("3. SB INITITALIZER");
	}
	public SavingsAccount() {
		System.out.println("4. Savings child account def cons called");
	}
	
	public void openAccount() {
		int balance = 10000;
		System.out.println("5. Savings account opened");
		System.out.println("Balance :"+balance);
		System.out.println("This.balance :"+this.balance);
		System.out.println("Super.balance :"+super.balance);
	
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("SAVINGS ACCOUNT FINALIZE CALLED");
	}

	@Override
	public void redeem() {
		// TODO Auto-generated method stub
		
	}
}
