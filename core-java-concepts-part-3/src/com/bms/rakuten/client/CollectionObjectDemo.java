package com.bms.rakuten.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bms.rakuten.model.Product;
import com.bms.rakuten.model.Rewards;
import com.bms.rakuten.sorting.ProductNameComparator;

public class CollectionObjectDemo {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();

		Product p1 = new Product(2, "Aroma", 1919, 223, "Excellent");
		Product p2 = new Product(322, "Lakme", 45, 411, "Excellent");
		Product p3 = new Product(3114, "Bottle", 332, 3, "Okay");

		products.add(new Product(191781, "Mouse", 100, 999, "Good"));
		products.add(p1);
		products.add(p2);
		products.add(p3);

		for (Product p : products) {
			System.out.println(p);
		}

		Collections.sort(products);

		System.out.println("-------------- After sorting by QOH ---------------------------------------");

		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------------------------------------");

		// Sort by name
		Collections.sort(products, new ProductNameComparator());
		System.out.println("-------------- After sorting by Product name ---------------------------------------");

		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------------------------------------");

		Rewards r = new Rewards() {
			@Override
			public void redeem() {
				System.out.println("Rewards redeemed");
			}
		};
		r.redeem();

		// use case : I want to sort on product id -- by using anonymous inner classes
		Collections.sort(products, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getProductId() > o2.getProductId())
					return 1;
				else
					return -1;
			}
		});
		System.out.println("-------------- After sorting by Product id ---------------------------------------");

		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------------------------------------");
		
	}
}
