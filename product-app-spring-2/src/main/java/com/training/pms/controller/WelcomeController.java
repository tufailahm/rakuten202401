package com.training.pms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

	@GetMapping			//localhost:9090/welcome
	public String welcome() {
		return "Welcome to My APP"; 
		
	}
	
	@GetMapping("rakuten")	//localhost:9090/welcome/rakuten
	public String welcomeRakuten() {
		return "Welcome to Rakuten APP"; 
		
	}
}
