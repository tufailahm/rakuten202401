package com.training.pms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.pms.Employee;
import com.training.pms.model.Author;

@Configuration
public class MyConfiguration {
	
	@Bean("newemp")		//getEmployee
	@Scope("prototype")
	public Employee getEmployee() {
		return new Employee("Sidda");
	}
	
	
	@Bean("oldemp")		//getEmployee
	@Scope("prototype")
	public Employee oldEmployee() {
		return new Employee("Francis");
	}
	
	
	@Bean(name = "myauthor")
	public Author getAuthor() {
		return new Author();
	}
}
