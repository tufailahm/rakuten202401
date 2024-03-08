package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ProductController {
 
    @Autowired
    Environment environment;
 
    @GetMapping("/")
    public String index() {
        return "ProductApp- Home Page";
    }
 
    @GetMapping("/productBackend")
    public String productBackend() {
    	
        System.out.println("Inside ProductController::backend...");
 
        String serverPort = environment.getProperty("local.server.port");
 
        System.out.println("Port : " + serverPort);		//9091
 
        return "Hello from ProductController  - Backend 3!!! " + " Host : localhost " + " :: Port : " + serverPort;
    }
}