package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.entity.AppConfig;
import com.example.entity.Product;

public class JavaBasedConfigApp {

	public static void main(String[] args) {
		// Create container
		ApplicationContext context 
				= new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Get bean from container
		Product product = context.getBean(Product.class);
		Product product2 = context.getBean(Product.class);
		
		// print bean
		System.out.println(product);
		
		
		// update product
		product.setProductId(999);
		product.setPrice(55000.0);
		product.setProductName("iphone 14");
		product.setQty(3);
		
		product2.setProductId(1000);
		product2.setPrice(40000.0);
		product2.setProductName("iphone 13");
		product2.setQty(2);
		
		// print product
		System.out.println(product);
		System.out.println(product2);
	}

}
// init(), destroy(), bean life cycle