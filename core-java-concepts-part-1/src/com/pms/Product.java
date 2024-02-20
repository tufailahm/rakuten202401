package com.pms;
// static key
public class Product {
		static int gst=99;	
		int price=100;
		
		
		public Product() {
			int price=200;
			price++;
			System.out.println("Product default cons called : "+(price+gst));
		}
		public Product(int price) {
			this.price = price;
		}
		public void changeGstRate() {
			gst = 999;
		}
		public void orderProduct() {
			price = price + 10;
			System.out.println("Your total price is :"+ (price+gst));
		}
		public static void main(String[] args) {
			new Product(1200).orderProduct();
			Product p1 = new Product(500);
			p1.changeGstRate();
			p1.orderProduct();
			Product p2= new Product();
			p2.orderProduct();
			
			System.out.println(gst);
			
		}
}
