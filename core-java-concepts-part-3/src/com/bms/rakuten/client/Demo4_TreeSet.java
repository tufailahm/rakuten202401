package com.bms.rakuten.client;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo4_TreeSet {

	public Demo4_TreeSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set<String> coupons = new LinkedHashSet<String>();
		coupons.add("JAVVA");
		coupons.add("UAVSS");
		coupons.add("KSHSUS");
		coupons.add("ISSHS");
		coupons.add("OOSHS");
		
		coupons.add("HHHAA");
		
		
		System.out.println(coupons);

	}

}
