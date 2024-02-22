package com.bms.rakuten.client;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Demo2_Vector {

	public Demo2_Vector() {
		
	}
	

	public void display() {
		
		
	}
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();	//generics -- detailed later
		names.add("shubham");	//0
		names.add("sahil");		//1
		names.add("devansh");		//2
		names.add("ahmed");
		names.add("shikar");
		
		//LL
		names.add(1, "krishna");
		System.out.println(names.remove(1));
		System.out.println(names.remove("sahil"));
		
		
		System.out.println(names);
		
		System.out.println("Printing one by one ------");
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		//sorting
		Collections.sort(names);
		System.out.println("After sorting -----------");
		System.out.println(names);
		
		
		System.out.println("sahil exists : "+names.contains("sahil"));
		
		System.out.println(names.get(3));
		
		System.out.println(names.size());
	}

}
