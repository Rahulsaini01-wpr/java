package com.wipro.java.oops;

/**
 * parent class = Employee
 * child class = Developer
 * extends = keyword
 */
public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {

		Employee employee = new Developer();
		employee.setId(1236);
		employee.setName("Ravi");
		employee.setSalary(50000f);
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}
}

