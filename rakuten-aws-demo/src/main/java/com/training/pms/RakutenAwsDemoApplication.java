package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutenAwsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenAwsDemoApplication.class, args);
	}

	@GetMapping("/rakuten")
	public String getMessage() {
		return "Hello from Shikhar Dhawan";
	}
}
