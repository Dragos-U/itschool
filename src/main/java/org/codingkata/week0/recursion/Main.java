package org.codingkata.week0.recursion;

public class Main {

    public static void main(String[] args) {
        RecursionUtilityClass.printNumbersDecreasing(5);
        System.out.println("\n5! = " + RecursionUtilityClass.getFactorial(5));

        System.out.println("3^3 = " + RecursionUtilityClass.raiseBaseToPower(3, 3));

        System.out.println("Mobile speakers: " + RecursionUtilityClass.mobileSpeakers(4));

        int number = 12234;
        System.out.println("The sum of digits in " + number + " is : " + RecursionUtilityClass.getSumOfDigits(number));

        int digit = 2;
        System.out.println("Counting "+digit+" in "+number+". -> "+RecursionUtilityClass.countDigitInNumber(number,digit));

        int[] array = {12, 34, 45, 56, 234, 456};
        System.out.println("Binary search : " +RecursionUtilityClass.binarySearch(array,45,0, array.length-1));
    }
}
