package com.training.bms.rakuten.client;

public class Client implements Runnable {

	Thread t1;

	public Client() {
		t1 = new Thread(this);
		t1.start();
		System.out.println("1. thread started by : "+Thread.currentThread().getName());
	}

	@Override
	public void run() 
	{
		System.out.println("###Hello executed by : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Client c1 = new Client();
		System.out.println("2. Hi executed by : "+Thread.currentThread().getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
					System.out.println("Another thread :"+currentThread().getName());
			}
		};
		t1.start();
		
		
		
	}

}
