package com.bms.raukten.model;

public class CurrentAccount extends Account {
	final int DAILY_LIMIT=18000;

	public Completed changePin() {
		System.out.println("Changing PIN for current account");
		return null;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("CURRENT ACCOUNT FINALIZE CALLED");
	}
	

}
