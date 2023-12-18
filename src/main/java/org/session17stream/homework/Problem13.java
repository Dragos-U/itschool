package org.session17stream.homework;

import java.util.Arrays;
import java.util.List;

public class Problem13 {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numbersAsInt = convertToIntegers(numbers);
        int sum = sumOfIntegers(numbersAsInt);

        System.out.println(sum);
    }

    public static List<Integer> convertToIntegers(List<String> input) {
        return input
                .stream()
                .map(s -> Integer.valueOf(s))
                .toList();
    }

    public static int sumOfIntegers(List<Integer> input) {
        return input
                .stream()
                .reduce(0, (acc, crt) -> acc + crt);
    }
}
