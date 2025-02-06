package com.wipro.java.java8;
//Importing LocalDate and TemporalAdjusters classes from java.time package
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Adjust {  // Main class to adjust dates
 
 // Main method: entry point for the Java program
 public static void checkingAdjusters() {
     
     // Getting the current date using LocalDate.now()
     LocalDate date = LocalDate.now();
     
     // Printing the current date to the console
     System.out.println("The current date is: " + date);
     
     // Adjusting the date to the first day of the next month
     // TemporalAdjusters.firstDayOfNextMonth() gets the first day of the next month
     LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
     System.out.println("First day of the next month is: " + firstDayOfNextMonth);
     
     // Adjusting the date to the next Saturday
     // TemporalAdjusters.next(DayOfWeek.SATURDAY) adjusts the date to the next Saturday
     LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
     System.out.println("Next Saturday from now is: " + nextSaturday);
     
    
 }
 
 // Main method to execute the checkingAdjusters function
 public static void main(String[] args) {
     checkingAdjusters();  // Calling the checkingAdjusters method to run the code
 }
}
