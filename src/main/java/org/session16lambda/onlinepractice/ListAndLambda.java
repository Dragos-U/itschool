package org.session16lambda.onlinepractice;

import java.util.Arrays;
import java.util.List;

public class ListAndLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Ken");

        names.forEach(name -> System.out.println("> " + name));
        names
                .stream()
                .filter(c -> c.startsWith("A"))
                .forEach(n -> System.out.println(n));
    }
}
