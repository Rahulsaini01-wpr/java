/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class = Employee
 * child class = Manager
 * extends = keyword
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {

		Employee employee = new Manager();
		employee.setId(1237);
		employee.setName("Mani");
		employee.setSalary(90000f);
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}
}
