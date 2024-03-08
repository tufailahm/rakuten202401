package com.training.pms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.dao.ProductDAO;
import com.training.pms.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Override
	public boolean addProduct(Product product) {
		if (product.getPrice() < 0)
			return false;
		else {
			productDAO.save(product);
			return true;
		}
	}

	@Override
	public boolean updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findByProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
