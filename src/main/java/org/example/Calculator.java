package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитание второго числа из первого
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Умножение двух чисел
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) a / b;
    }
}

