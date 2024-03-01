package com.bms.rakuten.client;

public class DemoDB {
	public static void main(String[] args) throws ClassNotFoundException {

		//1. Load the driver of the db of 
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
	}
}
