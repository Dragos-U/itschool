package org.session5.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int printFibonacciXvalues = 3;
        ArrayList<Integer> fibonacciSeries = FibonacciSeriesGenerator.generateTheFibonacciSeries(printFibonacciXvalues);
        System.out.println("\nThe Fibonacci series of the first "+ printFibonacciXvalues + " values is " + fibonacciSeries + "\n");

        int sumOfPromptedNumbers = FlowControlUtil.returnSumOfPromptedNumbers();
        System.out.println("Sum of numbers is " + sumOfPromptedNumbers + "\n");

        double averageOfPromptedNumbers = FlowControlUtil.returnAverageOfPromptedNumbers();
        System.out.println("The average of all numberss is " + averageOfPromptedNumbers + "\n");

        int sumOfNumbersGreaterThanFive = FlowControlUtil.returnSumOfAllNumbersGreaterThanFive();
        System.out.println("The average of all numbers greater than 5 is: "+ sumOfNumbersGreaterThanFive);

        FlowControlUtil.askingToGuessNumberAndPrintIndications();

        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(2, 6, 9, 9, 10, 0));
        FlowControlUtil.printArrayNumbersAndSpecifyParity(listOfNumbers);

        FlowControlUtil.menuDrivenProgram();
    }
}
