package com.bms.rakuten.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo_Searching {

	public Demo_Searching() {	
	}
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();	//generics -- detailed later
		names.add("shubham");	//0
		names.add("sahil");		//1
		names.add("devansh");		//2
		names.add("ahmed");
		names.add("shikar");
		names.add(1, "krishna");
		
	
		//sorting
		Collections.sort(names);
		System.out.println(names);
		int position = Collections.binarySearch(names,"ahmed");
		
		Collections.reverse(names);
		System.out.println(position);
		
		System.out.println(names);
	}
}