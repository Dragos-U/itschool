package org.session6.homework;

public class Main {

    public static void main(String[] args) {

        /*List<String> listOfStrings = new ArrayList<>(Arrays.asList("This ", "shall ", " be ", "a test"));

        String concatenatedString = StringUtilities.concatenateListOfStrings(listOfStrings);
        System.out.println("The concatenated string from the list: " + listOfStrings + " is :\n" + concatenatedString);

        String stringTest = "Remove vowels from this string.";
        String vowelessStringTest = StringUtilities.removeVowelsFromString(stringTest);
        System.out.println("\n" + stringTest + " -> " + vowelessStringTest);

        String capitalizeStringTest = StringUtilities.capitalizeWordsInString(stringTest);
        System.out.println("\n" + stringTest + " -> " + capitalizeStringTest);

        String replacedWordInStringTest = StringUtilities.replaceOneSubstringWithAnother(stringTest, "vowels", "numbers");
        System.out.println("\n" + stringTest + " -> " + replacedWordInStringTest);

        String stringTest2 = "All is not lost.";
        String removeDuplicateValues = StringUtilities.removeDuplicateAdjacentCharacters(stringTest2);
        System.out.println(removeDuplicateValues);

        String originalString = "Mary has two apples.";
        String stringToBeAdded = " and one half";
        int indexForInsertion = 11;
        String modifiedString = StringUtilities.insertNewStringAtIndex(originalString, stringToBeAdded, indexForInsertion);
        System.out.println(originalString + " -> " + modifiedString);

        Map<Character,Integer> characterFrequency = StringUtilities.countCharacterFrequencyInString(stringTest2);
        System.out.println("\n counting the number of char appearances in: "+ stringTest2 );
        for (Map.Entry<Character,Integer> entry : characterFrequency.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key: "+ key + "  value:"+ value);
        }

        String filePath = "D:/40_Java/itschool/src/main/java/org/session6/homework/morsecode.txt";
        Map<Character, String> morsecode = MorseCode.readMorseCodeFromFileAndReturnMap(filePath);
        String toBeConverted = originalString;
        String translatedString = MorseCode.stringToMorseCodeTranslator(toBeConverted,morsecode);
        System.out.println("\n The morse code for: [ "+originalString + " ] is :");
        System.out.println(translatedString);

        String encodeThisString = "AAAbbbc122 ";
        String encodedString = StringUtilities.encodeStringWithRunLengthEncoder(encodeThisString);
        System.out.println("\n"+ encodeThisString + " -> "+ encodedString);

        String decodedString = StringUtilities.decodeStringEncodedWithRLE(encodedString);
        System.out.println(decodedString);*/

        String checkingParantheses = "() [";
        System.out.println(StringUtilities.balancedParanthesisChecker(checkingParantheses));

        String interleaveOne = "ABCD";
        String interleaveTwo = "efgh";
        String interleavedString = StringUtilities.interleaveTwoStrings(interleaveOne, interleaveTwo);
        System.out.println(interleavedString);

        String toggleThis = "This Is An Upper String.";
        String toggledString = StringUtilities.toggleCaseUpperToLower(toggleThis);
        System.out.println(toggledString);

        String cammelCase = "ThisIsACamelCaseString";
        String snakeCase = StringUtilities.camelCaseToSnakeCaseConverter(cammelCase);
        System.out.println("\n"+cammelCase + "->"+snakeCase);
    }
}
