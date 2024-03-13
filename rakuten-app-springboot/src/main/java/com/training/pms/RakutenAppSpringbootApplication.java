package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutenAppSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenAppSpringbootApplication.class, args);
	}

	@GetMapping("/rakuten")
	public String getMessage() {
		return "Today is tuesday 12th March 2024";
	}
}
