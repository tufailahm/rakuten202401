package com.training.pms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.training.pms.model.Product;


public interface ProductDAO extends CrudRepository<Product, Integer>{

	public List<Product> findByProductName(String productName);
	public List<Product> findByQuantityOnHand(int qoh);
	public List<Product> findByPriceBetween(int lower,int upper);
	
	@Query("from Product where productName = :pName")
	public List<Product> findByProductName2(String pName);
	
}
