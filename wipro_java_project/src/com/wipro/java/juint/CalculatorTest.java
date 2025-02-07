/**
 * Test class for the Calculator class
 */
package com.wipro.java.juint;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test cases for the Calculator class methods.
 */
public class CalculatorTest {

    // Create an instance of the Calculator class to be tested
    private final Calculator calculator = new Calculator();
    
    /**
     * Test case for the add method.
     * Verifies that adding 3 and 2 gives the correct result, 5.
     */
    @Test
    public void testAdd() {
        // Call the add method with 3 and 2 as inputs
        int result = calculator.add(3, 2);
        // Assert that the result is 5
        assertEquals(5, result);
    }
    
    /**
     * Test case for the subtract method.
     * Verifies that subtracting 3 from 5 gives the correct result, 2.
     */
    @Test
    public void testSubtract() {
        // Call the subtract method with 5 and 3 as inputs
        int result = calculator.subtract(5, 3);
        // Assert that the result is 2
        assertEquals(2, result);
    }
}
