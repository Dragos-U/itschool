package org.session3.homework;

public class Main {

    public static void main(String[] args) {

        TwoNumbersOperations twoNumbersOperations = new TwoNumbersOperations();
        twoNumbersOperations.requestUserInput();
        twoNumbersOperations.calculateResultAndPrint();

        CountingWithForLoop countingWithForLoop = new CountingWithForLoop();
        countingWithForLoop.requestUserInput();
        countingWithForLoop.countAndDisplay();

        CalculateDiscount calculateDiscount = new CalculateDiscount();
        calculateDiscount.requestUserInput();
        calculateDiscount.calculateDiscountAndDisplay();

        CheckWhichNumberIsGreater checkWhichNumberIsGreater = new CheckWhichNumberIsGreater();
        checkWhichNumberIsGreater.requestUserInput();
        checkWhichNumberIsGreater.calculateRelation();
    }
}
