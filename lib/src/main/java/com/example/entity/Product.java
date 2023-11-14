package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	// Fields
	private long productId;
	private String productName;
	private double price;
	private int qty;
	
	// Constructors
	public Product(long productId, String productName, double price, int qty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}
	public Product() {
		super();
	}
	
	// Getters & Setters
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	
	

}
