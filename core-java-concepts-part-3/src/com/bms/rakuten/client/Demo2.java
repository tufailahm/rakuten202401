package com.bms.rakuten.client;
import java.util.*;

public class Demo2 {

	public Demo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> numbers=new Vector<Integer>();
		
		int count=0;
		while(count!=5) {
			int a=sc.nextInt();
			numbers.add(a);
			count++;
		}
		
		//Use Arrays.as list to convert
		System.out.println("Min is "+Collections.min(numbers));

	}

}