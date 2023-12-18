package org.session3javaoperators.homework;

import java.util.Scanner;

public class CountingWithForLoop {

    private int firstNumber;
    private int secondNumber;

    public void requestUserInput(){
        System.out.println("We shall count from one integer to another integer.");
        System.out.println("Please input the firstNumber followed by space and the secondNUmber followed by space");
        System.out.println(" Example1: 8  19");
        System.out.println(" Example2: 45  2");
        System.out.println("======================");
        System.out.println("Waiting for input ....");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(" ");
        this.firstNumber = (int) scanner.nextDouble();
        this.secondNumber = (int) scanner.nextDouble();
    }

    public void countAndDisplay (){
        if (firstNumber >= secondNumber) {
            countBackwardsAndDisplay();
        } else {
            countForwardsAndDisplay();
        }
        System.out.println();
        System.out.println("======================");
    }

    private void countBackwardsAndDisplay(){
        for (int index = firstNumber ; index >= secondNumber; index--) {
            printNumber(index);
        }
    }

    private void countForwardsAndDisplay(){
        for (int index = firstNumber; index <= secondNumber ; index++) {
            printNumber(index);
        }
    }

    public void printNumber(int number){
        System.out.print(" "+ number);
    }
}