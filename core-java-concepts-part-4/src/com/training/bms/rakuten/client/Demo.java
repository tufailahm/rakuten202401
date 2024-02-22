package com.training.bms.rakuten.client;

//yet another way of creating thread
public class Demo extends Thread{

	@Override
	public void run() {
		System.out.println("1. RUN CALLED BY :"+ currentThread().getName());
		try {
			Thread.sleep(45000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2. RUN CALLED BY :"+ currentThread().getName());
	
	}
	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		d.setName("SCORE");
		Thread.currentThread().setName("GAMES");
		d.start();	// main and child both alive
		System.out.println("1. Program started by thread :"+currentThread().getName());
		Thread.sleep(2000);
		
		d.interrupt();
		System.out.println("2. Program started by thread :"+currentThread().getName());

		
	}
}
