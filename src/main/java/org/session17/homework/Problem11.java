package org.session17.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Problem11 {

    private static final Pattern WORD_BREAK = Pattern.compile("\\W+");

    public static void main(String[] args) throws Exception {
        String filePath = "D:/40_Java/itschool/src/main/resources/PrideAndPrejudice.txt";
        findLongestWord(filePath);

        String longestWord = findLongestWord(filePath);
        System.out.println(longestWord);
    }

    private static String findLongestWord(String filePath) {
        try {
            return Files.lines(Paths.get(filePath))
                    .flatMap(line -> WORD_BREAK.splitAsStream(line))
                    .filter(word -> word.length() > 0)
                    .map(word -> word.toLowerCase())
                    .collect(Collectors.groupingBy(s -> s.length()))
                    .entrySet()
                    .stream()
                    .max(Comparator.comparingInt(Map.Entry::getKey))
                    .map(entry -> entry
                            .getValue()
                            .stream()
                            .max(Comparator.comparing(String::length)))
                    .flatMap(o -> o.map(Object::toString))
                    .orElse("");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
