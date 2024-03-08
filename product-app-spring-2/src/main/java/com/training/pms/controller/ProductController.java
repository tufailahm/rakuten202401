package com.training.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.training.pms.services.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	ProductDAO productDAO;

	@PostMapping // localhost:9090/product
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		ResponseEntity<String> responseEntity = null;
		boolean result = productDAO.existsById(product.getProductId());
		if (result == false) {
			result = productService.addProduct(product);
			if (result) {
				responseEntity = new ResponseEntity<String>("Saved ", HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<String>("Not Saved price negative", HttpStatus.OK);

			}
		} else {
			responseEntity = new ResponseEntity<String>("Product already exists ", HttpStatus.CONFLICT);

		}
		return responseEntity;
	}
	
	
	
	@GetMapping // localhost:9090/product
	public List<Product> getProducts() {
		return (List<Product>) productDAO.findAll();
	}

	@GetMapping("{productId}") // localhost:9090/product/999
	public ResponseEntity<Product> getProduct(@PathVariable("productId") int productId) {
		ResponseEntity<Product> responseEntity = null;
		Product product = new Product();
		Optional<Product> p = null;
		boolean result = productDAO.existsById(productId);
		if (result == false) {
			responseEntity = new ResponseEntity<Product>(product, HttpStatus.NO_CONTENT);
		} else {
			p = productDAO.findById(productId);
			product = p.get();
			responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
		}
		return responseEntity;
	}



	@DeleteMapping("{productId}") // localhost:9090/product/999
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId) {
		ResponseEntity<String> responseEntity = null;
		boolean result = productDAO.existsById(productId);
		if (result == false) {
			responseEntity = new ResponseEntity<String>("No product found", HttpStatus.NO_CONTENT);
		} else {
			productDAO.deleteById(productId);
			responseEntity = new ResponseEntity<String>("Product deleted successfully", HttpStatus.OK);
		}
		return responseEntity;
	}



	@PutMapping // localhost:9090/product
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		ResponseEntity<String> responseEntity = null;
		boolean result = productDAO.existsById(product.getProductId());
		if (result == false) {
			responseEntity = new ResponseEntity<String>("Not found ", HttpStatus.NO_CONTENT);
		} else {
			productDAO.save(product);
			responseEntity = new ResponseEntity<String>("Updated successfully", HttpStatus.OK);

		}
		return responseEntity;

	}

	@GetMapping("search/{lower}/{upper}")
	public String getProduct(@PathVariable("lower") Integer lower, @PathVariable("upper") Integer upper) {
		return "Getting products between price " + lower + " " + upper;
	}

	@GetMapping("getAllProduct") // localhost:9090/product/getAllProduct
	public String getAllProduct() {
		return "Getting all the products from DB by Product App";
	}

	@GetMapping("deleteProduct/{pId}") // localhost:9090/product/deleteProduct/7151
	public String deleteProduct(@PathVariable("pId") Integer productId) {
		// delete code
		return "Deleteing product with product id : " + productId;
	}

	@GetMapping("searchProduct/{lowerPrice}/and/{upperPrice}") // localhost:9090/product/deleteProduct/7151
	public String searchProduct(@PathVariable("lowerPrice") Integer lowerPrice,
			@PathVariable("upperPrice") Integer upperPrice) {
		// delete code
		return "You have searched for product range  " + lowerPrice + " and " + upperPrice;

	}

	
	@GetMapping("search/{productName}") // localhost:9090/product/999
	public List<Product> getProduct(@PathVariable("productName") String productName) {
		List<Product> products = productDAO.findByProductName2(productName);
		return products;
	}
	
	
}
