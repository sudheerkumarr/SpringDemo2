package com.example.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	Product getProduct() {
		Product product = new Product();
		return product;
	}
	
	@Bean
	Course getCourse() {
		Course course = new Course();
		return course;
	}

}
