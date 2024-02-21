package com.bms.raukten.client;

import java.util.Date;

import com.bms.raukten.model.Product;

public class ProductClient {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println("Current date/time is :"+d);

		String timeText = d.toString();		//converting object to string
		String time2 = timeText.substring(11, 13);	//slicing the string to get the hour
		int time3 = Integer.parseInt(time2);		//converting the string to int
		System.out.println(time3);
		if (time3 >= 8 && time3 <= 11)
		{
			System.out.println("Good morning");
		}
		else if (time3 >= 12 && time3 <= 16)
		{
			System.out.println("Good Afternoon");
		}
		else
		{
			System.out.println("Office is closed");
		}
		
		
		//Hands On:
		//Code here to greet the user based on system time
		//Good morning (8-12),afternoon(12-4) or evening(4-9)
		//Office is closed
		
		Product product1 = new Product(1911,"Lakme",11,99,"Good");
		Product product2 = new Product(191,"Lakme",11,99,"Good");
		System.out.println(product1.equals(product2));		//true		
		System.out.println(product1==product2);				//false
		
		Product product3 = product1;
		
		System.out.println(product1.equals(product3));			//true
		
		System.out.println(product1.hashCode());		//111222
		System.out.println(product2.hashCode());		//111244
		System.out.println(product3.hashCode());	
	}

}
