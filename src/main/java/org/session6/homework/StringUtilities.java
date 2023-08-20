package org.session6.homework;

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

    public static Map<Character, Integer> countCharacterFrequencyInString(String input) {
        Map<Character, Integer> savedCharacterFreq = new HashMap<>();
        for (char character : input.toCharArray()) {
            if (savedCharacterFreq.containsKey(character)) {
                int frequency = savedCharacterFreq.get(character);
                savedCharacterFreq.put(character, frequency + 1);
            } else {
                savedCharacterFreq.put(character, 1);
            }
        }
        return savedCharacterFreq;
    }

    public static String encodeStringWithRunLengthEncoder(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] inputCharArray = input.toCharArray();
        char oldValue = inputCharArray[0];
        int counter = 0;
        for (char charValue : inputCharArray) {
            if (charValue == oldValue) {
                counter++;
            } else {
                stringBuilder.append(counter).append(oldValue);
                counter = 1;
            }
            oldValue = charValue;
        }
        return stringBuilder.append(oldValue).toString();
    }

    public static String decodeStringEncodedWithRLE(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] inputCharArray = input.toCharArray();

        for (Character charValue : inputCharArray) {
            if (Character.isDigit(charValue)) {
                int intValue = charValue;
                for (int index = 0; index < intValue; index++) {
                    stringBuilder.append(charValue);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static boolean balancedParanthesisChecker(String input) {
        boolean isRoundOpen = false;
        boolean isSquareOpen = false;
        boolean isCurlyOpen = false;
        char[] inputArray = input.toCharArray();

        for (char charValue : inputArray) {
            if (charValue == '(') {
                isRoundOpen = true;
            } else if (charValue == ')') {
                isRoundOpen = false;
            }

            if (charValue == '[') {
                isSquareOpen = true;
            } else if (charValue == ']') {
                isSquareOpen = false;
            }

            if (charValue == '{') {
                isCurlyOpen = true;
            } else if (charValue == '}') {
                isCurlyOpen = false;
            }
        }
        return !(isRoundOpen && isSquareOpen && isCurlyOpen);
    }

    public static String interleaveTwoStrings(String firstString, String secondString) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] firstStringArray = firstString.toCharArray();
        char[] secondStringArray = secondString.toCharArray();
        if (firstString.length() == secondString.length()) {
            for (int index = 0; index < firstString.length(); index++) {
                stringBuilder.append(firstStringArray[index]).append(secondStringArray[index]);
            }
        } else {
            System.out.println("Error. The two strings should be of equal length!");
        }
        return stringBuilder.toString();
    }

    public static String toggleCaseUpperToLower(String input) {
        char[] inputArray = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char charValue : inputArray) {
            if (Character.isUpperCase(charValue)) {
                stringBuilder.append(Character.toLowerCase(charValue));
            } else {
                stringBuilder.append(charValue);
            }
        }
        return stringBuilder.toString();
    }

    public static String camelCaseToSnakeCaseConverter(String input){
        char[] inputArray = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char charValue : inputArray){
            if (Character.isUpperCase(charValue)&& (charValue!=inputArray[0])){
                stringBuilder.append("_").append(charValue);
            } else{
                stringBuilder.append(charValue);
            }
        }
        return stringBuilder.toString();
    }

    public static String encodeWithCaesarCypher(String input){

    }
}