package com.training.rakuten.pms.model;

public class Product {
		private int productId;
		private String productName;
		private int quantityOnHand;
		private int price;
		
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public Product(int productId, String productName, int quantityOnHand, int price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.quantityOnHand = quantityOnHand;
			this.price = price;
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
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand="
					+ quantityOnHand + ", price=" + price + "]";
		}
		
}
