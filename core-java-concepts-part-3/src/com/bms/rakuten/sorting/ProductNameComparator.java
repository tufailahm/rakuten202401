package com.bms.rakuten.sorting;

import java.util.Comparator;

import com.bms.rakuten.model.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductName().compareTo(o2.getProductName());
	}
}