package session_2.homework;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        System.out.println("> Welcome to the Calculator program <");
        System.out.println("-------------------------------------");
        System.out.println("The available operations are : + , - , *, /");
        System.out.println("You shall enter the operations in the following format" +
                "(with space between data and after the last number:");
        System.out.println("NUMBER_1 operation NUMBER_2");

        double result = 0;
        try (Scanner scanner = new Scanner(System.in)) {

            scanner.useDelimiter(" ");
            Double firstNumber = scanner.nextDouble();
            String operation = scanner.next();
            Double secondNumber = scanner.nextDouble();
            scanner.nextLine();
            result = switch (operation) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                case "/" -> firstNumber / secondNumber;
                default -> throw new IllegalStateException("Unexpected value: " + operation);
            };
            System.out.format("%.1f %s %.1f = %.2f",
                    firstNumber,
                    operation,
                    secondNumber,
                    result);

        } catch (Exception e) {
            System.out.println("Exception catched.");
        }
    }
}