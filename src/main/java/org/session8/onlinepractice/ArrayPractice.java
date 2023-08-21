package org.session8.onlinepractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numberList = {1, 4, 7, 3, 10};
        printArrayAverage(numberList);
        printIntSortedArray(numberList);

        String[][] names = {
                {"Ionel", "Georgel"},
                {"Tintel", "Tintel"}
        };

        printMultidimensionalArray(names);
        printStringSearchResult(names[0],"Ionel");

        printIntSearchResult(numberList, 10);
    }

    private static void printArrayAverage(int[] numberList) {
        int sum = 0;

        for (int number : numberList) {
            sum += number;
            System.out.print(" " + number);
        }

        int averageresult = sum / numberList.length;
//        System.out.println(Arrays.stream(numberList).average());
        System.out.println("  Arrays average = " + averageresult);
//        Arrays.stream(numberList).forEach(System.out::print);
    }

    public static void printMultidimensionalArray(String[][] names) {
//        System.out.println(names[0][0] + " " +names[1][0]);

        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.println(names[index2][index] + " ");
            }
            System.out.println();
        }
    }

    public static void printStringSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);

        for (String input : arrayInput) {
            System.out.println(input);
        }
    }

    public static void printIntSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);
        for (int value : arrayInput) {
            System.out.println(value);
        }
    }

    public static void printStringSearchResult(String[] arrayInput, String searchKey){
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey){
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }
}