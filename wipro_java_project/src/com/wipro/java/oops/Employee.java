package com.wipro.java.oops;


/**
 * Employee class represents an employee entity with properties like ID, name, designation, and salary.
 * This class provides getters and setters for these properties to manipulate and retrieve the employee's information.
 * POJO : Plain old java object access through getter/setter
 * @author rahul
 */

public class Employee {
	
	
	// Fields (attributes) of the Employee class
	private int id; // This is the employee ID
	private String name; // This is the employee's name
	private String designation; // This is the employee's job designation (e.g., Software Engineer)
	private double salary; // This is the employee's salary
	
	
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// toString method to represent the Employee object as a string
		public String toString() {
			return "Employee [ID=" + id + 
			       ", Name=" + name + 
			       ", Designation=" + designation + 
			       ", Salary=" + salary + "]";
		}
	
	// Main method - this is the entry point for the program when run
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// You can use this method for testing the Employee class in the future
	}
}
