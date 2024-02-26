package com;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class UpdateDocumentJDBC {

	public static void main(String[] args) {

		int productId = 999;
		String productName = "NewBottle";
		int quantityOnHand = 1;
		int price = 1;

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB productDb = mongoClient.getDB("productdb");
		DBCollection col = productDb.getCollection("product");
		
		
		BasicDBObject updatedProductDocument = new BasicDBObject();
		updatedProductDocument.put("productName", productName);
		updatedProductDocument.put("quantityOnHand", quantityOnHand);
		updatedProductDocument.put("price", price);

		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", updatedProductDocument);

		col.update(updatedProductDocument, updateObj);
		

		System.out.println("Product updated successfully");
	}
}
