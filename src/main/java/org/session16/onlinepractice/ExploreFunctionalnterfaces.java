package org.session16.onlinepractice;

import java.util.function.Function;

public class ExploreFunctionalnterfaces {

    public static void main(String[] args) {
        Function<String, Integer> stringLentghFinder = str -> str.length();
        System.out.println(stringLentghFinder.apply("Hello world"));
    }
}
