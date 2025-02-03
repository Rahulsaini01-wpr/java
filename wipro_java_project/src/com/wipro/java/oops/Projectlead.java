package com.wipro.java.oops;

/**
 * parent class = Employee
 * child class = Projectlead
 * extends = keyword
 */
public class Projectlead extends Employee {

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
//		Projectlead projectlead = new Projectlead(); wrong 
//		Projectlead projectlead1=(Projectlead) new Employee(); wrong
		
		//Child object is instantiated from child constructor
		// Parent Class consumes the properties and behaviors of child class		
		
		Employee employee = new Projectlead();
		employee.setId(1234);
		employee.setName("Rahul");
		employee.setSalary(80000f);
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}
	
}
