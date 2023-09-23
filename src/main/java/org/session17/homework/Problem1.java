package org.session17.homework;

import java.util.Arrays;
import java.util.List;

public class Problem1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        findAndPrintEvenNumbers(numbers);
    }

    public static void findAndPrintEvenNumbers(List<? extends Number> input) {
        input
                .stream()
                .filter(number -> (int) number % 2 == 0)
                .forEach(number -> System.out.print(number+" "));
    }
}
