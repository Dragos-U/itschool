package org.session16.onlinepractice;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = (a, b, op) -> executeOperation(a, b, op);
        System.out.println(calculator.calculate(2, 4, '+'));
    }

    private static double executeOperation(double a, double b, char op) {
        switch (op) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a + b;
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        }
    }
}

