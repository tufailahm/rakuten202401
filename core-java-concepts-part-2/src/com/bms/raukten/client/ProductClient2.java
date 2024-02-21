package com.bms.raukten.client;

import com.bms.raukten.exception.NegativePriceException;
import com.bms.raukten.model.Product;

public class ProductClient2 {

	public static void main(String[] args) {
		Product product1 = null;
		Product product2 = null;
		// Price cannot be set to negative
		try {
			product1 = new Product(1911, "Lakme", 11, 99, "Good");
			product2 = new Product(191, "Lakme", 11, -899, "Good");

		} catch (NegativePriceException e) {
			System.out.println("Price cannot be negative");
		}

		System.out.println(product1);
		System.out.println(product2);
	}

}
