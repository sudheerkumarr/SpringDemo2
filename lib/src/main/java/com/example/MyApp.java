package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Address;
import com.example.entity.Employee;

public class MyApp {

	public static void main(String[] args) {

		/**
		 * Setter Injection - property tag
		 * 
		 */

		// Step 1: Create Spring container using xml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSI.xml");

		// Step 2: Get bean/obj from container
		Employee e1 = (Employee) context.getBean("emp1");

		// Step 3: print result
		System.out.println(e1);

		// Get address obj
		Address a1 = (Address) context.getBean("addr1");

		// print results
		System.out.println(a1);

		/*
		 * Constructor Injection - constructor-arg
		 */
		/*
		 * // Step 1: Create Spring container using xml
		 * 
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * // Step 2 :Get emp obj from spring container // DesignPatterns - ~21 design
		 * patterns - Singleton, Prototype Employee e1 =
		 * (Employee)context.getBean("emp1"); Employee e2 =
		 * (Employee)context.getBean("emp1"); Employee e3 =
		 * (Employee)context.getBean("emp1"); Employee e4 =
		 * (Employee)context.getBean("emp1");
		 * 
		 * 
		 * 
		 * // Step 3 : print emp details System.out.println(e1); System.out.println(e2);
		 * 
		 * System.out.println(e1.hashCode()); System.out.println(e2.hashCode());
		 * System.out.println(e3.hashCode()); System.out.println(e4.hashCode());
		 * 
		 * System.out.println(); Employee e5 = (Employee)context.getBean("emp2");
		 * System.out.println(e5); System.out.println(e5.hashCode());
		 * 
		 * Employee e6 = (Employee)context.getBean("emp3"); System.out.println(e6);
		 * 
		 * Employee e7= (Employee)context.getBean("emp4"); System.out.println(e7);
		 * 
		 */

	}

}
