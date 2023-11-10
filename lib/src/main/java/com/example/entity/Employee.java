package com.example.entity;

import java.util.List;

public class Employee {
	
	// Fields
	private int id;
	private String name;
	private String contactNo;
	
	private List<String> emailList;
	
	private Address address;
	
	// Constructors
	public Employee() {}
	public Employee(int id, String name, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	
	
	public Employee(int id, String name, String contactNo, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}
	
	
	public Employee(int id, String name, String contactNo, List<String> emailList, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.emailList = emailList;
		this.address = address;
	}
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<String> getEmailList() {
		return emailList;
	}
	public void setEmailList(List<String> emailList) {
		this.emailList = emailList;
	}
	
	// toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", emailList=" + emailList
				+ ", address=" + address + "]";
	}

	


	
}
