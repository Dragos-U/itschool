package org.session17stream.homework;

import java.util.List;
import java.util.Optional;

public class Problem2 {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("apple", "banana", "cherry", "date", "elderberry");
        String longestItem = printListLongestItem(listOfStrings);
        System.out.println(longestItem);
    }

    public static String printListLongestItem(List<String> ls){
        Optional<String> result = ls
                .stream()
                .sorted((o1,o2) -> o2.length() - o1.length())
                .findFirst();
        return result.orElse("");
    }
}
