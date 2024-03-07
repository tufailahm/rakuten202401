package com.training.pms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.pms.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

}
