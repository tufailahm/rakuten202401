package com.pms;

public class Product {
		int price=100;
		
		public Product() {
			price++;
			System.out.println("Product default cons called");
		}
		
		
		public Product(int price) {
			super();
			this.price = price;
		}


		public void orderProduct() {
			price = price + 10;
			System.out.println("Your total price is :"+price);
		}
		public static void main(String[] args) {
			
		//	new Product(1200).orderProduct();
			
			Product p1 = new Product(122);
			p1.orderProduct();
			
		//	p1 = new Product();
		//	p1.orderProduct();
			
		}
}
