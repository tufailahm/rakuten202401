package com.bms.raukten.client;

public class PrintTwoMesssage {

	public void message1() throws InterruptedException{
		System.out.println("Hello");
		Thread.sleep(2000);
		System.out.println("Thanks");
	}

	public void message2() throws Exception {
		System.out.println("Hello message2");
		Thread.sleep(2000);
		System.out.println("Thanks message2");
	}

	public static void main(String[] args) throws Exception  {

		PrintTwoMesssage p = new PrintTwoMesssage();
		p.message1();
		p.message2();

	}
}



//--> JVM --> Main --> message1  --> main --> message2 --> JVM
