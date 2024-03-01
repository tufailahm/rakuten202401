package com.training.rakuten.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.training.rakuten.pms.model.Product;
import com.training.rakuten.pms.utility.DBConnection;

public class ProductDAOImpl implements ProductDAO {

	Connection connection = DBConnection.getDBConnection();
	Statement statement = null;
	ResultSet res = null;
	PreparedStatement preparedStatement = null;
	int result = 0;

	@Override
	public boolean addProduct(Product product) {
		try {
			preparedStatement = connection.prepareStatement("insert into products values (?,?,?,?)");
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setInt(3, product.getQuantityOnHand());
			preparedStatement.setInt(4, product.getPrice());

			result = preparedStatement.executeUpdate(); // insertion takes place here

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 0)
			return false;
		else
			return true;
		/*
		 * statement = connection.createStatement(); int result =
		 * statement.executeUpdate("insert into products values(100,'lakme',99,100)");
		 * if(result ==0) return false; else return true;
		 */

	}

	@Override
	public void findByProduct() {
		try {
			statement = connection.createStatement();
			res = statement.executeQuery("select * from products");
			while (res.next()) {
				System.out.print(res.getString(1) + "    ");
				System.out.print(res.getString(2) + "    ");
				System.out.print(res.getString(3) + "    ");
				System.out.println(res.getString(4) + "    ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			res.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean updateProduct(int productId, Product product) {
		try {
			result = preparedStatement.executeUpdate();
			preparedStatement = connection.prepareStatement
					("update products set productName = ?, quantityOnHand = ?, price = ? where productId = ?" );
					preparedStatement.setInt(4, productId);
					preparedStatement.setString(1, product.getProductName());
					preparedStatement.setInt(2, product.getQuantityOnHand());
					preparedStatement.setInt(3, product.getPrice());
					preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		if (result == 0)
			return false;
		else
			return true;
	}
	@Override
	public boolean deleteProduct(int productId) {
		
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate("delete from products where productId = " + productId);
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result == 0)
			return false;
		else
			return true;
	}

	@Override
	public Product findByProduct(int productId) {
		Product product = new Product();
		try {
			statement = connection.createStatement();
			res = statement.executeQuery("select * from products where productId = " + productId);
			if (res.next()) {
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			res.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}

	@Override // lakme
	public void findByProduct(String productName) {
		try {
			statement = connection.createStatement();
			// select * from products where productName = 'lakme'
			res = statement.executeQuery("select * from products where lower(productName) = '" + productName + "'");
			while (res.next()) {
				System.out.print(res.getString(1) + "    ");
				System.out.print(res.getString(2) + "    ");
				System.out.print(res.getString(3) + "    ");
				System.out.println(res.getString(4) + "    ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			res.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
