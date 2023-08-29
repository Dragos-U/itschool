package org.codingkata.week0.recursion;

public class RecursionUtilityClass {

    private RecursionUtilityClass() {
        throw new IllegalStateException("Utility class should not be instantiated.");
    }

    public static void printNumbersDecreasing(int number) {
        if (number == 0) return;
        System.out.print(number + " ");
        printNumbersDecreasing(number - 1);
    }

    public static int getFactorial(int number) {
        if (number < 2) return 1;
        return number * getFactorial(number - 1);
    }

    public static int raiseBaseToPower(int base, int power) {
        if (power == 1) return base;
        return base * raiseBaseToPower(base, power - 1);
    }

    /*
     * We have mobile phone numbers.
     * Those ending with an even number have 2 speakers
     * Those ending with an odd number have 1 speaker
     * Return the total number of speakers for all devices
     * */

    public static int mobileSpeakers(int mobiles) {
        if (mobiles == 0) return 0;

        if (mobiles % 2 == 0) {
            return 2 + mobileSpeakers(mobiles - 1);
        } else {
            return 1 + mobileSpeakers(mobiles - 1);
        }
    }

    /*
     * Send an integer to a method and return the sum of all digits
     * 123 -> 1 + 2 + 3 = 6
     * 321 % 10 = 1  ( saves the rightmost digit)
     * 321 / 10 = 32 (removes the rightmost digit)
     * base case : verify if the number has only one digit
     *  % separates the last digit and call the function without it
     * */

    public static int getSumOfDigits(int number) {
        if (number < 9) return number;
        return number % 10 + getSumOfDigits(number / 10);
    }

    /*
     * Count the number of times a digit appears in an integer
     * 12355 -> 2
     * */

    public static int countDigitInNumber(int number, int digit) {
        if (number <= 9) {
            if (number == digit) {
                return 1;
            } else {
                return 0;
            }
        }
        if (number % 10 == digit) {
            return 1 + countDigitInNumber(number / 10, digit);
        } else {
            return countDigitInNumber(number / 10, digit);
        }
    }

    /* Binary search
     * */

    public static int binarySearch(int[] array, int key, int start, int end) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > key) {
                return binarySearch(array, key, start, middle - 1);
            } else if (array[middle] < key) {
                return binarySearch(array, key, middle + 1, end);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
