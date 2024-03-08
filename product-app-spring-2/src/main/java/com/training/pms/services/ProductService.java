package com.training.pms.services;

import java.util.List;

import com.training.pms.model.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public boolean updateProduct(int productId, Product product);
	public boolean deleteProduct(int productId);
	public Product findByProduct(int productId);
	public List<Product> findByProduct(String productName);
	public List<Product> findByProduct();
}
