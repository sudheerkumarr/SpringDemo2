package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Course;
import com.example.entity.Employee;
import com.example.entity.Student;

public class AnnotationBasedApp {

	public static void main(String[] args) {
		
		// Create Spring container
		ApplicationContext context =
				  new ClassPathXmlApplicationContext("applicationContextAnnotationBasedConfig.xml");
	/*	
		// get required objects from spring container
		Student std1 = (Student)context.getBean("student");
		Student std2 = (Student)context.getBean("student");
		
//		Employee emp1 = (Employee)context.getBean("employee");
//		System.out.println(emp1);
		
		// print student details
		System.out.println(std1);
		System.out.println(std2);
		
		// update student details
		std1.setName("Sam");
		std1.setContactNo("9999911111");
		std1.setRollNo(211);
		
		// print student details
		System.out.println(std1);
		*/
		
//		List<Course> courseList = new ArrayList<>(); 
//		System.out.println(courseList); // []
//
//		// create courses
//		Course crs1 = new Course(201, "Java", 45);
//		Course crs2 = new Course(202, "Python", 30);
//		Course crs3 = new Course(203, "JavaScript", 15);
//
//
//
//		// add course to list
//		courseList.add(crs1);
//		courseList.add(crs2);
//		courseList.add(crs3);
//		
//		
//		// print courseList
//		System.out.println(courseList);
//		System.out.println(courseList.get(0));
//		System.out.println(courseList.get(0).getCourseName());
//		
//		System.out.println();
//		
//		//courseList.get(0).get(1);//
//		System.out.println(courseList.get(1).getCourseDuration());
		
		Student s1 = (Student)context.getBean("std");
		
		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());
		System.out.println(s1.getContactNo());
		
		System.out.println(s1);

		
		s1.setRollNo(401);
		s1.setName("Krish");
		s1.setContactNo("9999912345");
		
		
		// get course objects from spring container
		Course course1= (Course)context.getBean("course");
		course1.setCourseId(500);
		course1.setCourseName("Java");
		course1.setCourseDuration(30);
		
		Course course2= (Course)context.getBean("course");
		course2.setCourseId(501);
		course2.setCourseName("Python");
		course2.setCourseDuration(15);
		
		
		List<Course> courseList = new ArrayList<>();
		
		// add course to list
		courseList.add(course1);
		courseList.add(course2);
	
		s1.setCourseList(courseList);
		
		// print student
		System.out.println(s1);
		
		
		
	}

}
