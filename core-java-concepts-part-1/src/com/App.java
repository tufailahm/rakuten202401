package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mongodb.jdbc.MongoDriver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mongo://localhost:27017/local"); 
		System.out.println("Connected");

		/*
		 * String query = "db.customer().find()"; Statement statement =
		 * con.createStatement(); ResultSet rs = statement.executeQuery(query); Object
		 * json = rs.getObject(1);
		 */
	}
}
