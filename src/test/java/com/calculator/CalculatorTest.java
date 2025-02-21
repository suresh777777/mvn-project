package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(4, calculator.divide(20, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}

