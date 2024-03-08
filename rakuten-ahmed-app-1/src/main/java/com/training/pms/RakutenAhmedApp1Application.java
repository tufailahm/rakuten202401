package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RakutenAhmedApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(RakutenAhmedApp1Application.class, args);
	}

}
