package com.dstack;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculationTest {

    @Test
    public void ShouldReturnSumTest() {
        double a = 1;
        double b = 2;
        double expected = 4;

        double result = CalculatorDemo.Add(a, b);
        assertEquals("unexpected sum", expected, result,0.001);
    }

    @Test
    public void TestShouldReturnSubstraction() {
        double a = 1;
        double b = 2;
        double expected = -1;

        double result = CalculatorDemo.Substract(a, b);
        assertEquals("unexpected substaction result", expected, result, 0.001);
    }

    @Test
    public void TestShouldReturnMultiplication() {
        double a = 1;
        double b = 2;
        double expected = 2;

        double result = CalculatorDemo.Multiply(a, b);
        assertEquals("unexpected multiplication result", expected, result,0.001);
    }

    @Test
    public void TestShouldReturnDivision() {
        double a = 1;
        double b = 2;
        double expected = 0.5;

        double result = CalculatorDemo.Divide(a, b);
        assertEquals("unexpected division result", expected, result, 0.001);
    }

    @Test
    public void TestShouldReturnDivisionException() {
        double a = 1;
        double b = 0;

        IllegalArgumentException actualException = null;
        try {
            CalculatorDemo.Divide(a, b);
        } catch (IllegalArgumentException ex) {
            actualException = ex;
        }
        assertNotNull("no exception gotten", actualException);
        assertEquals("unexpected exception type", actualException.getClass(), IllegalArgumentException.class);

    }

    @Test
    public void TestShouldReturnModulus() {
        double a = 1;
        double b = 2;
        double expected = 1;

        double result = CalculatorDemo.Modulus(a, b);
        assertEquals("unexpected remainder calculated", expected, result, 0.001);
    }

    @Test
    public void TestShouldReturnModulusDivisionException() {
        double a = 1;
        double b = 0;

        IllegalArgumentException actualException = null;
        try {
            CalculatorDemo.Modulus(a, b);
        } catch (IllegalArgumentException ex) {
            actualException = ex;
        }
        assertNotNull("no exception gotten", actualException);
        assertEquals("unexpected exception type", actualException.getClass(), IllegalArgumentException.class);
    }
}
