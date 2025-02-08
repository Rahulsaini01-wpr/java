package com.wipro.java.usecase.junit;

import com.wipro.java.usecase.Employee;
import com.wipro.java.usecase.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class EmployeeTest {

    private EmployeeService employeeService;

    @Before
    public void setUp() {
        // Create an instance of EmployeeService before each test
        employeeService = new EmployeeService();
    }

    @Test
    public void testAddEmployee() {
        Employee emp = new Employee(1, "John Doe", "HR", 50000, LocalDate.now());
        employeeService.addEmployee(emp); // Call the method to add employee
        
        // Verify employee is added
        assertEquals(1, employeeService.employees.size()); // Verify that the employee list size is 1
    }

    @Test
    public void testRemoveEmployee() {
        Employee emp = new Employee(2, "Jane Smith", "IT", 60000, LocalDate.now());
        employeeService.addEmployee(emp);
        
        // Remove employee
        employeeService.removeEmployee(2);
        
        // Verify employee is removed
        assertEquals(0, employeeService.employees.size()); // List should be empty now
    }

    @Test
    public void testUpdateSalary() {
        Employee emp = new Employee(3, "Alice Brown", "Sales", 40000, LocalDate.now());
        employeeService.addEmployee(emp);
        
        // Update employee salary
        employeeService.updateSalary(3, 45000);
        
        // Verify that salary is updated
        assertEquals(45000, emp.getSalary(), 0.01); // Salary should now be 45000
    }

    @Test
    public void testFilterByDepartment() {
        Employee emp1 = new Employee(4, "Bob White", "HR", 50000, LocalDate.now());
        Employee emp2 = new Employee(5, "Charlie Black", "IT", 60000, LocalDate.now());
        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
        
        // Test filtering by HR department
        employeeService.filterByDepartment("HR");
    }

    @Test
    public void testSortByEmployeeName() {
        Employee emp1 = new Employee(6, "David Green", "IT", 70000, LocalDate.now());
        Employee emp2 = new Employee(7, "Eva Red", "HR", 80000, LocalDate.now());
        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
        
        // Test sorting employees by name
        employeeService.sortByEmployeeName(); // Should sort and display employees by name
    }

    @Test
    public void testSearchByEmployeeID() {
        Employee emp = new Employee(8, "Helen Blue", "Marketing", 65000, LocalDate.now());
        employeeService.addEmployee(emp);
        
        // Test searching for an employee by ID
        employeeService.searchByEmployeeID(8); // Should display employee details
    }
}
