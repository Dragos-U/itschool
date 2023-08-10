package org.leetcode.palindrome;

public class ValidPalindrome {

    // https://leetcode.com/problems/valid-palindrome/
    public boolean isPalindrome(String s){
        String firstString = toLowerCaseRemoveSpaceAndNonAlphanumeric(s);
        String secondString = reverseAllCharacters(firstString);
        return firstString.equals(secondString) ? true : false;
    }

    public static String toLowerCaseRemoveSpaceAndNonAlphanumeric(String s){
        return s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
    }

    public static String reverseAllCharacters(String input){
        StringBuilder reversedBuilder = new StringBuilder(input);
        reversedBuilder.reverse();
        return reversedBuilder.toString();
    }
}
