package org.session17stream.homework;

import java.util.Arrays;
import java.util.List;

public class Problem10 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        long totalNumberOfChars = countCharsInStringList(strings);
        System.out.println(totalNumberOfChars);
    }

    private static long countCharsInStringList(List<String> strings) {
        return strings
                .stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .count();
    }
}
