package org.session17.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four");
        String delimiter = ",";
        String concatString = concatenateStringsUsingDelimiter(strings, delimiter);
        System.out.println(concatString);
    }

    public static String concatenateStringsUsingDelimiter(List<String> strings, String delimiter) {
        String concatString = strings
                .stream()
                .collect(Collectors.joining(delimiter));
        return concatString;
    }
}
