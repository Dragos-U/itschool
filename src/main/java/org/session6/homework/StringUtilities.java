package org.session6.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtilities {

    private StringUtilities() {
        throw new IllegalStateException("Utility class should not instantiated.");
    }

    public static String concatenateListOfStrings(List<String> input) {
        StringBuilder concatenatedString = new StringBuilder();
        for (String value : input) {
            concatenatedString.append(value);
        }
        return concatenatedString.toString();
    }

    public static String removeVowelsFromString(String input) {
        StringBuilder vowellessString = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (!isVowel(character)) {
                vowellessString.append(character);
            }
        }
        return vowellessString.toString();
    }

    public static boolean isVowel(char inputChar) {
        char[] vowels = {'a', 'i', 'e', 'o', 'u'};
        return (inputChar == vowels[0]) || (inputChar == vowels[1]) || (inputChar == vowels[2]) || (inputChar == vowels[3]) || (inputChar == vowels[4]);
    }

    public static String capitalizeWordsInString(String input) {
        StringBuilder output = new StringBuilder();
        boolean capitalizeWord = true;
        for (char character : input.toCharArray()) {
            if (Character.isWhitespace(character)) {
                output.append(character);
                capitalizeWord = true;
            } else if (capitalizeWord) {
                output.append(Character.toUpperCase(character));
                capitalizeWord = false;
            } else {
                output.append(Character.toLowerCase(character));
            }
        }
        return output.toString();
    }

    public static String replaceOneSubstringWithAnother(String inputString, String replaceThis, String replaceWith) {
        StringBuilder output = new StringBuilder(inputString);
        int[] indexes = findStartToFinishIndexesInStringForWord(inputString, replaceThis);
        return output.replace(indexes[0], indexes[1], replaceWith).toString();
    }

    public static int[] findStartToFinishIndexesInStringForWord(String inputString, String word) {
        int[] indexes = {0, 0};
        indexes[0] = inputString.indexOf(word);
        indexes[1] = indexes[0] + word.length();
        System.out.println();
        return indexes;
    }

    public static String removeDuplicateAdjacentCharacters(String input) {
        StringBuilder output = new StringBuilder();
        char[] values = {' ', ' '};
        for (int index = 0; index < input.length(); index++) {
            values[0] = input.charAt(index);
            if (values[0] != values[1]) {
                output.append(values[0]);
            }
            values[1] = values[0];
        }
        return output.toString();
    }

    public static String insertNewStringAtIndex(String originalString, String stringToBeAdded, int index) {
        StringBuilder outputString = new StringBuilder(originalString);
        String partOne = outputString.substring(0, index + 1).toString();
        String partTwo = outputString.substring(index + 1, originalString.length()).toString();
        String modifiedString = partOne + stringToBeAdded + partTwo;
        return modifiedString;
    }

    public static Map<Character,Integer> countCharacterFrequencyInString(String input) {
        Map<Character, Integer> savedCharacterFreq = new HashMap<>();
        for (char character : input.toCharArray()) {
            if(savedCharacterFreq.containsKey(character)){
                int frequency = savedCharacterFreq.get(character);
                savedCharacterFreq.put(character,frequency+1);
            } else {
                savedCharacterFreq.put(character,1);
            }
        }
        return savedCharacterFreq;
    }
}