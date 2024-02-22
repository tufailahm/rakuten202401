package com.bms.rakuten.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bms.rakuten.model.Product;

public class UsingAnonymousInnerClassesComparator {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();

		Product p1 = new Product(2, "Aroma", 1919, 223, "Excellent");
		Product p2 = new Product(322, "Lakme", 45, 411, "Excellent");
		Product p3 = new Product(3114, "Bottle", 332, 3, "Okay");

		products.add(new Product(191781, "Mouse", 100, 999, "Good"));
		products.add(p1);
		products.add(p2);
		products.add(p3);


		Comparator<Product> reviewComparator = new Comparator<Product>()
		{
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getReview().compareTo(o2.getReview());
			}
			
		};
		
		Collections.sort(products, reviewComparator);
		for (Product p : products) {
			System.out.println(p);
		}
	}
}
