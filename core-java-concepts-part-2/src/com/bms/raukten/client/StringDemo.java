package com.bms.raukten.client;

public class StringDemo {

	public static void main(String[] args) {
		String name1 = "Richard";
		String name2 = new String("Richard");
		
		System.out.println(name1==name2);		//reference	//false
		System.out.println(name1.equals(name2));	//true
		
		//mutable
		StringBuffer sb1 = new StringBuffer("Hello");
		
		sb1.append(" all");
		
		System.out.println(sb1.length());

		//JDK1.5	- not thread safe and fast
		StringBuilder sb2 = new StringBuilder("Hello");
		
		sb1.append(" all");
		
		System.out.println(sb1.length());
		
		
	}

}
