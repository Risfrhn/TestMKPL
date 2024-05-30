/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class CalculatorTest {

    @Test
    public void testCalculate() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(10, 5, 2, 4, 2);
        assertEquals(7, result);
    }

    @Test
    public void testIsPositive() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isPositive(10));
        assertFalse(calculator.isPositive(-5));
    }

    @Test
    public void testFindMax() {
        Calculator calculator = new Calculator();
        int[] numbers = {10, 5, 20, 8, 15};
        assertEquals(20, calculator.findMax(numbers));
    }

    @Test
    public void testPublicField() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.publicField);
    }

    @Test
    public void testGetMin() {
        Calculator calculator = new Calculator();
        int[] numbers = {10, 5, 20, 8, 15};
        assertEquals(5, calculator.getMin(numbers));
    }
}
