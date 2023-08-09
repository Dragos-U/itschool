package org.session3.homework;

import java.util.Scanner;

public class CheckWhichNumberIsGreater {

    private double firstNumber;
    private double secondNumber;

    public void requestUserInput(){
        System.out.println("We shall check the relation between two given numbers.");
        System.out.println("Please input the firstNumber followed by space and the secondNumber followed by space");
        System.out.println(" Example: 24  19 ");
        System.out.println("======================");
        System.out.println("Waiting for input ....");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(" ");
        this.firstNumber = scanner.nextDouble();
        this.secondNumber = scanner.nextDouble();
    }

    public void calculateRelation(){
        if(firstNumber==secondNumber){
            System.out.println("First number is equal to the second one.");
        } else if (firstNumber>secondNumber) {
            System.out.println("First number is greater than the second one.");
        } else {
            System.out.println("First number is smaller than the first one.");
        }
    }
}
