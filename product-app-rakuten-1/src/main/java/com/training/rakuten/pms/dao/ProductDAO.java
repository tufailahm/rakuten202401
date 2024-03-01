package com.training.rakuten.pms.dao;

import java.util.List;

import com.training.rakuten.pms.model.Product;

public interface ProductDAO {

	public boolean addProduct(Product product);
	public boolean updateProduct(int productId, Product product);
	public boolean deleteProduct(int productId);
	public Product findByProduct(int productId);
	public void findByProduct(String productName);
	public void findByProduct();
}
