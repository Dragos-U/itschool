package org.session17.homework;

import java.util.Arrays;

public class Problem6 {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        int sum = sumOfIntegers(numbers);
        System.out.println(sum);
    }

    public static int sumOfIntegers(Integer[] input){
        return Arrays.stream(input)
                .reduce(0, (acc,current) -> acc + current);
    }
}
