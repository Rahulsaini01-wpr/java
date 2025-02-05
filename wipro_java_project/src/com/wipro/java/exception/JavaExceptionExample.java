package com.wipro.java.exception;  // Package declaration

/**
 * Class for handling Java exceptions
 */
// 
public class JavaExceptionExample {   
    public static void main(String args[]) { // Main method - entry point for the program
        int number1 = 0, number2 = 0, division;  // Variable declarations for i, j, and data
        
        try {  // Try block where exceptions may occur
        	division = number1 / number2;  // Division by zero, which will cause an exception
        } 
        catch(Exception e) {  // Catch block to handle any exception (in this case, ArithmeticException for division by zero)
            System.out.println(e.toString());  // Print the exception details
        } 
        finally {  // Finally block which is executed regardless of whether an exception occurred or not
            System.out.println("I am Executed as always");  // This will always print
        }
        System.out.println("Rest of code");
    }   
}
