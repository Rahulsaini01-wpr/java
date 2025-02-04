package com.wipro.java.exception;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        // Example of a checked exception (IOException)
        File file = new File("wrong_path");  // incorrect path to trigger an exception
        try {
            // Attempt to open the file (which may throw IOException)
            FileReader reader = new FileReader(file);
        } catch (IOException e) {
            // Catch and print the stack trace of the IOException
            e.printStackTrace();  // Prints the exception stack trace
        }
    }
}
