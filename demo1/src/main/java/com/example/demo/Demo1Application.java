package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class Demo1Application {

	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/")
	public String index() {
		log.info("Before Execution");
		return "<h1> Hello World<h1>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
