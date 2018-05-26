package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void ShouldReturnSum() {
        double a = 1;
        double b = 2;
        double expected = 4;

        var result = CalculatorDemo.Add(a, b);
        Assertions.assertEquals(expected, result, "unexpected sum");
    }

    @Test
    public void ShouldReturnSubstraction() {
        double a = 1;
        double b = 2;
        double expected = -1;

        var result = CalculatorDemo.Substract(a, b);
        Assertions.assertEquals(expected, result, "unexpected substaction result");
    }

    @Test
    public void ShouldReturnMultiplication() {
        double a = 1;
        double b = 2;
        double expected = 2;

        var result = CalculatorDemo.Multiply(a, b);
        Assertions.assertEquals(expected, result, "unexpected multiplication result");
    }

    @Test
    public void ShouldReturnDivision() {
        double a = 1;
        double b = 2;
        double expected = 0.5;

        var result = CalculatorDemo.Divide(a, b);
        Assertions.assertEquals(expected, result, "unexpected division result");
    }

    @Test
    public void ShouldReturnDivisionException() {
        double a = 1;
        double b = 0;

        IllegalArgumentException actualException = null;
        try {
            CalculatorDemo.Divide(a, b);
        } catch (IllegalArgumentException ex) {
            actualException = ex;
        }
        Assertions.assertNotNull(actualException, "no exception gotten");
        Assertions.assertEquals(actualException.getClass(), IllegalArgumentException.class, "unexpected exception type");

    }

    @Test
    public void ShouldReturnModulus() {
        double a = 1;
        double b = 2;
        double expected = 1;

        var result = CalculatorDemo.Modulus(a, b);
        Assertions.assertEquals(expected, result, "unexpected remainder calculated");
    }

    @Test
    public void ShouldReturnModulusDivisionException() {
        double a = 1;
        double b = 0;

        IllegalArgumentException actualException = null;
        try {
            CalculatorDemo.Modulus(a, b);
        } catch (IllegalArgumentException ex) {
            actualException = ex;
        }
        Assertions.assertNotNull(actualException, "no exception gotten");
        Assertions.assertEquals(actualException.getClass(), IllegalArgumentException.class, "unexpected exception type");
    }
}
