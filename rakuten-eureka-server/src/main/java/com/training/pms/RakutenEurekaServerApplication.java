package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RakutenEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenEurekaServerApplication.class, args);
	}

}
