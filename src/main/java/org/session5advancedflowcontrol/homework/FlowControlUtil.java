package org.session5advancedflowcontrol.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowControlUtil {

    private FlowControlUtil() {
        throw new IllegalStateException("Utility class should not be instantiated");
    }

    public static int returnSumOfPromptedNumbers() {
        System.out.println("The program will print the sum of all numbers entered from the console");
        System.out.println("Enter number. (-1 for Exit)");
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        int inputValue = scanner.nextInt();

        while (inputValue != -1) {
            inputList.add(inputValue);
            inputValue = scanner.nextInt();
        }

        return sumOfAllNumbersFromList(inputList);
    }

    public static int returnSumOfAllNumbersGreaterThanFive() {
        System.out.println("The program will print the sum of all numbers greater than 5 entered from the console");
        System.out.println("Enter 10 numbers by pressing Enter after each one.");
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int sumOfAllNumbers = 0;

        for (int index = 2; index <= 10; index++) {
            value = scanner.nextInt();
            if (value < 5) continue;
            sumOfAllNumbers += value;
        }
        return sumOfAllNumbers;
    }

    public static double returnAverageOfPromptedNumbers() {
        System.out.println("The program will print the average of all numbers entered from the console");
        System.out.println("Enter number. (0 for Exit)");
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        int inputValue = scanner.nextInt();

        LOOP:
        while (true) {
            inputList.add(inputValue);
            inputValue = scanner.nextInt();
            if (inputValue == 0) break LOOP;
        }

        return (double) sumOfAllNumbersFromList(inputList) / inputList.size();
    }

    public static void askingToGuessNumberAndPrintIndications() {
        System.out.println("Guess the number I have in memory.");

        Scanner scanner = new Scanner(System.in);
        int guessedValue = scanner.nextInt();
        int actualValue = 20;

        do {
            if (guessedValue < actualValue) {
                System.out.println("You are too low.");
            } else {
                System.out.println("You are too high");
            }
            guessedValue = scanner.nextInt();
        } while (guessedValue != actualValue);
        System.out.println("You are spot on!");
    }

    public static void printArrayNumbersAndSpecifyParity(ArrayList<Integer> inputList) {
        for (int value : inputList) {
            if ((value % 2 == 0)) {
                System.out.println(value + " is even.");
            } else {
                System.out.println(value + " is odd.");
            }
        }
    }

    public static void menuDrivenProgram() {
        System.out.println("\nMenu options");
        System.out.println("------------");

        ArrayList<String> menuOptions = new ArrayList<>();
        menuOptions.add("1. Print \"Hello World\" ");
        menuOptions.add("2. Print the user's name.");
        menuOptions.add("3. Exit");

        printArray(menuOptions);
        System.out.println("\n Choose an option by its number...");

        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        if (inputValue >= 3) {
            inputValue = 3;
            System.out.println("Exiting.");
        }

        while (inputValue != 3) {
            switch (inputValue) {
                case 1:
                    System.out.println("Hello World\n");
                    break;
                case 2:
                    System.out.println("User's name is Dragos\n");
                    break;
            }
            printArray(menuOptions);
            inputValue = scanner.nextInt();
        }
    }

    public static void printArray(List<String> inputList) {
        for (String value : inputList) {
            System.out.println(value);
        }
    }

    public static int sumOfAllNumbersFromList(List<Integer> inputList) {
        return inputList
                .stream()
                .reduce(0, (accumulator, actualValue) -> accumulator + actualValue);
    }
}
