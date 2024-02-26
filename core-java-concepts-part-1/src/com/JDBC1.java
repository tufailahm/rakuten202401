package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("mongodb.jdbc.MongoDriver");
		System.out.println("DL");
		/*
		 * Properties properties = new Properties(); properties.put("user", "someuser");
		 * properties.put("password", "somepassword" );
		 */

		Connection con = DriverManager.getConnection("jdbc:mongodb://localhost:27017/"); // OTHER URL

		String query = "db.sampleCollection().find()";
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(query);
		Object json = rs.getObject(1);

	}

}
