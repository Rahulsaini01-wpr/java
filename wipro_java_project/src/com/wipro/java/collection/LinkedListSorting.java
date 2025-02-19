package com.wipro.java.collection;
import java.util.*;

//Employee class
class Employee {
 int id;
 String name;
 double salary;

 public Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // Display employee details
 @Override
 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
 }
}

//Comparator to sort employees by name
class NameComparator implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return e1.name.compareTo(e2.name);
 }
}

public class LinkedListSorting {
 public static void main(String[] args) {
     // Creating a LinkedList of Employees
     LinkedList<Employee> employees = new LinkedList<>();

     // Adding Employees to LinkedList
     employees.add(new Employee(103, "Pratik", 45000));
     employees.add(new Employee(101, "Ram", 55000));
     employees.add(new Employee(102, "Shyam", 50000));

     // Sorting by Name using Comparator
     Collections.sort(employees, new NameComparator());

     // Displaying sorted employees
     System.out.println("Employees sorted by name:");
     for (Employee emp : employees) {
         System.out.println(emp);
     }
 }
}

