package com.wipro.java.exception;



public class UncheckedException {
    public static void main(String[] args) {
        // Example of an unchecked exception (NullPointerException)
        try {
            // Attempt to call a method on a null object
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (Exception e) {
            // Catch and print the stack trace of the exception
            e.printStackTrace();  // Prints the exception stack trace
        }
    }
}
