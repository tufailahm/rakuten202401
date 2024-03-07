package com.training.pms;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.model.Customer;
import com.training.pms.model.Orders;

//@SpringBootApplication(scanBasePackages = "com.client")
@SpringBootApplication
@RestController
public class ProductAppSpring1Application {

	@Autowired	//asking spring to provide employee obkect
	@Qualifier("newemp")
	Employee e1;
	
	@Autowired		//asking spring to provide employee obkect
	@Qualifier("newemp")
	Employee e2;
	
	@Autowired
	Customer customer;
	
	@Autowired
	Orders orders;
	
	
	
	public static void main(String[] args) {
	      ApplicationContext ctx =  SpringApplication.run(ProductAppSpring1Application.class, args);
	      /*
	        String[] beanNames = ctx.getBeanDefinitionNames();
	         
	        Arrays.sort(beanNames);
	         
	        for (String beanName : beanNames)
	        {
	            System.out.println(beanName);
	        }
*/
		//Tomcat - port 8080
		System.out.println("##Server started on port : 9090");
		
	}

	@GetMapping("/rakuten")		//http://localhost:9090/rakuten
	public String hello() {
		//e2.employeeName = "Prajwal";
		
		return "E1 : " +e1.getEmployeeDetails()+ "E2 :  "+e2.getEmployeeDetails();
	}
	
	@GetMapping						//http://localhost:9090
	public String dowork()
	{
		return "Hi";
	}
	
	@GetMapping("sahil")			//http://localhost:9090/hello
	public String dowork2()
	{
		return "Hello Rakuten, Hyd";
	}
}