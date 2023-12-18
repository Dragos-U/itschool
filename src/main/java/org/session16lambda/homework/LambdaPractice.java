package org.session16lambda.homework;

import org.session16lambda.homework.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPractice {

    public static void main(String[] args) {

        // Problem 1
        List<Integer> intList = Arrays.asList(12, 4, 6, 8, 5, 3, 12, 14);
        List<Integer> evenNumbers = filterNumbers(intList, number -> number % 2 == 0);
        System.out.println(evenNumbers);
        // v2
        intList
                .stream()
                .filter(number -> number % 2 == 0)
                .forEach(element -> System.out.print(element + " "));

        // Problem 2 and 4
        List<String> nameList = Arrays.asList(
                "Alice",
                "Bob",
                "Ted",
                "Ken",
                "Jay",
                "Zed",
                "Kim",
                "Charlie");

        System.out.println("\n-----------------------------");
        nameList
                .stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\n----------------------------");
        nameList
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s + " "));

        // Problem 3
        System.out.println("\n-- P3 --------------------------");
        Integer sum = intList
                .stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println("Sum of all numbers in intList is : " + sum);

        // Problem 5
        System.out.println("\n-- P5 --------------------------");
        List<Double> doubleList = Arrays.asList(1.2, 3.0, 2.8);
        ListMaxFinder<Double> maxValue = dl -> {
            double maxVal = Double.MIN_VALUE;
            for (Double number : dl) {
                if (number > maxVal) {
                    maxVal = number;
                }
            }
            return maxVal;
        };

        Double maximum = maxValue.findMaximum(doubleList);
        System.out.println("Maximum value : " + maximum);

        // Problem 6
        System.out.println("\n-- P6 --------------------------");
        StringComparator stringComparator = ((stringOne, stringTwo) -> {
            if (stringOne.length() > stringTwo.length()) return 1;
            if (stringOne.length() < stringTwo.length()) return -1;
            return 0;
        });

        String stringOne = "laptop";
        String stringTwo = "mouse";
        int comparingResult = stringComparator.compareStringsByLength(stringOne, stringTwo);
        System.out.println("String 1 > String 2 ? " + comparingResult);


        // Problem 7
        System.out.println("\n-- P7 --------------------------");
        StringTruncator stringTruncator = ((stringInput, firstNChars) -> {
            if (firstNChars > stringInput.length()) firstNChars = stringInput.length();
            return stringInput.substring(0, firstNChars);
        });
        String testString = "It was the best of times, it was the worst of times.";
        String truncated = stringTruncator.returnFirstNChars(testString, 15);
        System.out.println(truncated);

        // Problem 8
        System.out.println("\n-- P8 --------------------------");
        ListMapper listMapper = (input, mapper) -> {
            List<Integer> output = new ArrayList<>();
            for (Integer number : input){
                output.add(mapper.apply(number));
            }
            return output;
        };

        List<Integer> mappedList = listMapper.map(intList, number -> 2*number);
        System.out.println(intList);
        System.out.println(mappedList);

        // Problem 9
        System.out.println("\n-- P9 -------------------------");
        List<Integer> oddNumbers = filterNumbers(intList, number -> number % 2 != 0);
        System.out.println(oddNumbers);

        // Problem 10
        System.out.println("\n-- P 10 -------------------------");
        NameFormatter nameFormatter = inputList -> {
            List<String> outputList = new ArrayList<>();
            for (String item : inputList) {
                outputList.add(item.toUpperCase());
            }
            return outputList;
        };

        List<String> namesToUpperCase = nameFormatter.toUpperCase(nameList);
        System.out.println(namesToUpperCase);

        // Problem 11
        System.out.println("\n-- P11 --------------------------");
        ItemChecker<String> itemChecker = ((itemList, item) -> itemList.contains(item));
        String checkName = "Bob";
        boolean isNamePresent = itemChecker.isItemInList(nameList, checkName);
        System.out.println("Is " + checkName + " present ? " + isNamePresent);

        // Problem 12
        System.out.println("\n-- P12 --------------------------");
        StringJointer stringJointer = (s1, s2) -> s1 + " " + s2;
        String result = stringJointer.jointStrings(stringOne, stringTwo);
        System.out.println(result);

        // Problem 13
        System.out.println("\n-- P13 --------------------------");
        NumberSqrt numberSqrt = number -> Math.sqrt(number);
        Double input = 16.4;
        Double resultsqrt = numberSqrt.sqrtNumber(input);
        System.out.println("Sqrt of + " + input + " is > " + resultsqrt);

        // Problem 14
        System.out.println("\n-- P14 --------------------------");
        PairMaker<String, Double> pairMaker = (s, d) -> new Pair<>(s, d);
        Pair<String, Double> pair = pairMaker.makepair("Dragos", 1986.0);
        System.out.println(pair);

        // Problem 15
        System.out.println("\n-- P15 --------------------------");
        ListFilter<String> listFilter = (inputList, cond) -> {
            List<String> output = new ArrayList<>();
            for (String item : inputList) {
                if (cond.test(item)) {
                    output.add(item);
                }
            }
            return output;
        };

        List<String> filterNames = listFilter.filterList(nameList, str -> str.startsWith("K"));
        System.out.println("Names that start with K > " + filterNames);
        System.out.println("\n----------------------------");
    }



    public static List<Integer> filterNumbers(List<Integer> intList, Predicate<Integer> condition) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : intList) {
            if (condition.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}