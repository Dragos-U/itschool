package org.session17stream.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem9 {

    private static final Comparator<Map.Entry<String, Long>> valueOrder =
            Map.Entry.comparingByValue();
    private static final Comparator<Map.Entry<String, Long>> reversedValue = valueOrder.reversed();


    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        List<String> words = stringListToListOfWords(sentences);
        System.out.println(words);

        String word = findMostFrequentStringInList(words);
        System.out.println(word);
    }

    private static String findMostFrequentStringInList(List<String> input) {
        return input
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(reversedValue)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    private static List<String> stringListToListOfWords(List<String> input) {
        return input
                .stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();
    }
}
