package com.example.entity;

public class Address {

	// Fields
	private String city;
	private String state;

	// Constructors
	Address() {}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	// Getters & Setters
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// toString
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
