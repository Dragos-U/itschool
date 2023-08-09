package org.session3.homework;

import java.util.Scanner;

public class TwoNumbersOperations {

    private double firstNumber;
    private double secondNumber;
    private String operator;
    private double result;

    public void requestUserInput(){
        System.out.println("We shall do an operation on two numbers.");
        System.out.println("Please input the operation as bellow with space between each part");
        System.out.println(" Example>3.46 + 6");
        System.out.println("======================");
        System.out.println("Waiting for input ....");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        String[] userInputSplitted = userInput.split(" ");
        this.firstNumber = Double.parseDouble(userInputSplitted[0]);
        this.secondNumber = Double.parseDouble(userInputSplitted[2]);
        this.operator = userInputSplitted[1];
    }
    public void calculateResultAndPrint(){
        result = switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "%" -> firstNumber % secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        System.out.println("The result of the above operation is : " + result+"\n");
    }
}
