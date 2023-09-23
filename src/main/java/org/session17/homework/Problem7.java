package org.session17.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> integers = stringlengthToInteger(strings);
        System.out.println(integers);
    }

    private static List<Integer> stringlengthToInteger(List<String> strings) {
        return strings
                .stream()
                .map(s -> s.length())
                .toList();
    }
}
