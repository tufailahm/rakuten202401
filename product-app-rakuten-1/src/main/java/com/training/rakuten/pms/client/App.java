package com.training.rakuten.pms.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded successfully");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", 
				"postgres",
				"root");
		System.out.println("Connected");
		Statement stat = connection.createStatement();
		ResultSet res = stat.executeQuery("select * from employees");

		while (res.next()) {
			System.out.print(res.getInt(1)+ "   ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+"  ");
			System.out.println(res.getInt("salary"));
		}
		//close the connection
		connection.close();
	}
}
