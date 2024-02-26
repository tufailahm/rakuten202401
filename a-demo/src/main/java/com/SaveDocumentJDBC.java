package com;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class SaveDocumentJDBC {

	public static void main(String[] args) {
		
		int productId = 999;
		String productName = "Bottle";
		int quantityOnHand = 999;
		int price =999;
		
		MongoClient mongoClient = new MongoClient("localhost",27017);
		DB productDb = mongoClient.getDB( "productdb" );

		
		DBCollection col = productDb.getCollection("product");
		BasicDBObject productDocument = new BasicDBObject();
		productDocument.put("productId", productId);
		productDocument.put("productName", productName);
		productDocument.put("quantityOnHand", quantityOnHand);
		productDocument.put("price", price);
		col.insert(productDocument);
		
		System.out.println("Product saved successfully");
	}
}
