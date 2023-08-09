package org.codingkata.week3;

public class StringManipulation {

    public static int getStringLength(String input){
        int length =0;
        for (char c : input.toCharArray()){
            length++;
        }
        return length;

    }

    public static String getReversedString(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
