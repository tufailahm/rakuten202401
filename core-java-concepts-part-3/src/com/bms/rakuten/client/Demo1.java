package com.bms.rakuten.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Demo1 {

	public Demo1() {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();	//generics -- detailed later
		names.add("shubham");	//0
		names.add("sahil");		//1
		names.add("devansh");		//2
		names.add("ahmed");
		names.add("shikar");
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
