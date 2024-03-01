package com.training.rakuten.pms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
		public static Connection getDBConnection() {
			Connection connection=null;
			try {
				Class.forName("org.postgresql.Driver");
				 connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", 
						"postgres",
						"root");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		}
}
