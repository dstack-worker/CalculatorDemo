package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {
        int a = 1;
        var b = 0;

        System.out.println("Add results in " + Add(a, b));
        System.out.println("Substract results in " + Substract(a, b));
        System.out.println("Multiply results in " + Multiply(a, b));
        try {
            System.out.println("Divide results in " + Divide(a, b));
        } catch (Exception ex) {
            System.out.println("exception gotten");
        }
        try {
            System.out.println("Modulus results in " + Modulus(a, b));
        } catch (Exception ex) {
            System.out.println("exception gotten");
        }
        System.out.println("Add results in " + Add(a, b));
    }

    public static double Add(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public static double Substract(double arg1, double arg2) {
        return arg1 - arg2;
    }

    public static double Multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double Divide(double arg1, double arg2) {
        if (arg2 == 0) throw new IllegalArgumentException("division by zero");
        return arg1 / arg2;
    }

    public static double Modulus(double arg1, double arg2) {
        if (arg2 == 0) throw new IllegalArgumentException("division by zero");
        return arg1 % arg2;
    }
}
