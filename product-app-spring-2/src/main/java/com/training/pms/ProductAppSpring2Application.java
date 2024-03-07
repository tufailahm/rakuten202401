package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductAppSpring2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppSpring2Application.class, args);
		System.out.println("### server started on port : 9090 ");
	}

}
