package com.training.bms.rakuten.client;

public class DB1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		System.out.print("Postgres driver loaded");
	}

}
