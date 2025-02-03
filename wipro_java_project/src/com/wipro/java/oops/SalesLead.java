/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class = Employee
 * child class = Sales
 * extends = keyword
 */
public class SalesLead extends Employee {
	public SalesLead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {

		Employee employee = new SalesLead();
		employee.setId(1235);
		employee.setName("Raj");
		employee.setSalary(60000f);
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}
}
