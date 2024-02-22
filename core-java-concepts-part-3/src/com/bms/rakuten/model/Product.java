package com.bms.rakuten.model;

import java.util.Objects;

import com.bms.raukten.exception.NegativePriceException;


public class Product implements Comparable<Product> {
	private int productId = 10;
	private String productName = "Aroma";
	private int quantityOnHand = 1500;
	private int price = 98;
	private String review = "Excellent";
	@Override
	public int compareTo(Product o) {
		System.out.println("CompareTo called");
		if (this.quantityOnHand > o.quantityOnHand)
			return 1;
		else
			return -1;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantityOnHand, review);
	}

	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand && Objects.equals(review, other.review);
	}

	public Product() {
	}

	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		if (price > 0) {
			this.price = price;
		} else {
			price = 0;
			throw new NegativePriceException("Price cannot be negative");
		}
	}

	public Product(int productId, String productName, int quantityOnHand, int price, String review) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.review = review;
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 0;
			throw new NegativePriceException("Price cannot be negative");
		}
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 0;
			throw new NegativePriceException("Price cannot be negative");
		}
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + ", review=" + review + "]";
	}



}
