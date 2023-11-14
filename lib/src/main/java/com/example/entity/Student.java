package com.example.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {

	// Fields
	private int rollNo;
	private String name;
	private String contactNo;

	// Types of injection - SetterInject, FiledInjection , Construction Injection
	// FieldInjection
	//@Autowired 
	private List<Course> courseList;

	// Constructors
	public Student() {
	}

	// Constructor injection
	// @Autowired
	public Student(List<Course> courseList) {
		this.courseList= courseList;
	}
	public Student(int rollNo, String name, String contactNo) {
		this.rollNo = rollNo;
		this.name = name;
		this.contactNo = contactNo;
	}

	
	public Student(int rollNo, String name, String contactNo, List<Course> courseList) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.contactNo = contactNo;
		this.courseList = courseList;
	}

	// Getters & Setters
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return this.rollNo;
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

	public List<Course> getCourseList() {
		return courseList;
	}

	// Setter Injection
	@Autowired
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	// toString
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", contactNo=" + contactNo + ", courseList="
				+ courseList + "]";
	}

}
