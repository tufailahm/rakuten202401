package com.training.pms.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	String customerName;
	
	public Customer() {
		customerName = "Sanskar";
	}
	
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	public String payBill() {
		return "Your final bill is : 176000";
	}
}
