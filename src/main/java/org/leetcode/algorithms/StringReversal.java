package org.leetcode.algorithms;

public class StringReversal {

    public static void main(String[] args) {

        String input = "abcd";
        String output = reverseString(input);

        System.out.println("input: " + input);
        System.out.println("output: " + output);

    }

    private static String reverseString(String input) {
        if(input.isEmpty()){
            return input;
        } else {
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }
}
