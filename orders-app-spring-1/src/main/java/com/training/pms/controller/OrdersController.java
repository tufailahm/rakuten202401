package com.training.pms.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	RestTemplate restTemplate;
	
	ResponseEntity<String> data;
	@GetMapping()							//localhost:7070/orders
	public String getOrders() {
		try {
			URI productURI = 
					new URI("http://localhost:9090/product");
			
			data = restTemplate.getForEntity(productURI, String.class);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Response from product service : " + data.toString()+ "Status code :"+data.getStatusCode();
	}
	
}
