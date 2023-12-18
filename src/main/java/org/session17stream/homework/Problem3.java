package org.session17stream.homework;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem3 {

    public static void main(String[] args) {
        int streamUpperLimit = 100;
        generateAndPrintPrimeNumbers(streamUpperLimit);
    }

    public static void generateAndPrintPrimeNumbers(int upperLimit) {
        Stream<Integer> stream = Stream
                .iterate(1, integer -> integer + 1)
                .limit(upperLimit)
                .filter(Problem3::isPrime);
        stream.forEach(n -> System.out.print(n + " "));

       /* IntStream.rangeClosed(1, upperLimit)
                .filter(Problem3::isPrime)
                .forEach(System.out::println);*/
    }

    public static boolean isPrime(Integer number) {
        return number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(divisor -> number % divisor == 0);
    }
}
