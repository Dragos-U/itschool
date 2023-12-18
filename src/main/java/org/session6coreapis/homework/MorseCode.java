package org.session6coreapis.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    public static Map<Character, String> readMorseCodeFromFileAndReturnMap(String filePath) {
        Map<Character, String> morseCodeValues = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    char character = parts[0].charAt(0);
                    String symbol = parts[1].trim();
                    morseCodeValues.put(character, symbol);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return morseCodeValues;
    }

    public static String stringToMorseCodeTranslator(String toBeConverted, Map<Character, String> morsecode) {
        String upperCasedString = toBeConverted.toUpperCase();
        StringBuilder translatedCode = new StringBuilder();
        for (char character : upperCasedString.toCharArray()) {
            if (character != ' ') {
                translatedCode.append(morsecode.get(character));
            }
        }
        return translatedCode.toString();
    }
}
