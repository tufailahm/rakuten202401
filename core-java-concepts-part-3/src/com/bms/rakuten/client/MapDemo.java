package com.bms.rakuten.client;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> datas = new LinkedHashMap<Integer,String>();
		
		datas.put(9171,"Jay");
		datas.put(9172,"Tarun");
		datas.put(9173,"Mohit");
		datas.put(1,"Jja");
		datas.put(122,"Jja");

		System.out.println(datas.get(1));
		
		datas.replace(9173, "Isha");
		
		System.out.println(datas);
	}
}
