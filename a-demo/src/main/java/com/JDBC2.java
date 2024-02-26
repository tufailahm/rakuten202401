package com;

import java.sql.SQLException;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class JDBC2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		DB db1 = mongoClient.getDB( "productdb" );
		DBCollection col = db1.getCollection("customer");
		BasicDBObject query = new BasicDBObject("customerName", "Kalpana");
		DBCursor cursor = col.find(query);
		System.out.println(cursor.count());
		while (cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
	}
}