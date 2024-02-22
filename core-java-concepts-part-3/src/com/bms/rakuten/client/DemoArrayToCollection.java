package com.bms.rakuten.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoArrayToCollection {

	public DemoArrayToCollection() {
		
	}
	
	public static void main(String[] args) {
		
		String names[]= {"Neha","Kalpana","Shubham","Tarun","Jay"};
		
		List<String> namesList = new ArrayList<String>();
		
		namesList = Arrays.asList(names);
		
		Collections.sort(namesList);
		
		System.out.println(namesList);
	
	}
}
