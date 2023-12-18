package org.session17stream.homework;

public class Problem8 {

    public static void main(String[] args) {
        String sentence = "Hello World";
        long vowelsNumber = vowelCounter(sentence);
        System.out.println("{ "+sentence + " } has > "+ vowelsNumber+" vowels");
    }

    private static long vowelCounter(String sentence) {
        String vowels = "AEIOUaeiou";
        return sentence
                .chars()// 72, 101, ..
                .mapToObj(c -> (char) c) // 'H' 'e' ...
                .filter(c -> vowels.contains(c.toString()))
                .count();
    }
}
