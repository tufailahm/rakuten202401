package com.training.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.dao.ProductDAO;
import com.training.pms.model.Product;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@GetMapping			//localhost:9090/product
	public String getProducts() {
		//code for returning all the products
		return "GETTING ALL THE PRODUCTS"; 
	}
	@GetMapping("{productId}")			//localhost:9090/product/999
	public Product getProduct(@PathVariable("productId")int productId) {
		Product product = new Product();
		product.setProductId(productId);
		return product;
	}
	@GetMapping("search/{productName}")			//localhost:9090/product/999
	public String getProduct(@PathVariable("productName")String productName) {
		//code for returning all the products
		return "GETTING A SINGLE PRODUCT BY NAME :: "+productName; 
	}
	@DeleteMapping("{productId}")			//localhost:9090/product/999
	public String deleteProduct(@PathVariable("productId")int productId) {
		//code for returning all the products
		return "DELETEING  A SINGLE PRODUCT :: "+productId; 
	}
	@PostMapping			//localhost:9090/product
	public String saveProduct(@RequestBody Product product) {
		//code for saving product
		productDAO.save(product);
		return "Your product saved  : "+product.toString(); 
	}
	@PutMapping			//localhost:9090/product
	public String updateProduct(@RequestBody Product product) {
		//code for returning all the products
		return "Your product updated  : "+product.toString(); 
	}
	
    @GetMapping("search/{lower}/{upper}")
    public String getProduct(@PathVariable("lower")Integer lower,
                             @PathVariable("upper")Integer upper){
        return "Getting products between price "+lower+" "+upper;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("getAllProduct")			//localhost:9090/product/getAllProduct
	public String getAllProduct() {
		return "Getting all the products"; 
	}
	
	@GetMapping("deleteProduct/{pId}")			//localhost:9090/product/deleteProduct/7151
	public String deleteProduct(@PathVariable("pId")Integer productId) {
		//delete code 
		return "Deleteing product with product id : "+productId; 
	}

	@GetMapping("searchProduct/{lowerPrice}/and/{upperPrice}")			//localhost:9090/product/deleteProduct/7151
	public String searchProduct
		(@PathVariable("lowerPrice")Integer lowerPrice,
		 @PathVariable("upperPrice")Integer upperPrice) {
		//delete code 
		return "You have searched for product range  "+lowerPrice +" and "+upperPrice; 
	
	}
	
}
