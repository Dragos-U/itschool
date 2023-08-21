package org.session8.homework;

import java.util.*;

public class WorkingWithArraysAndLists {

    private WorkingWithArraysAndLists() {
        throw new IllegalStateException("Utility classes should not be instantiated!");
    }

    public static String[] printShoppingList() {
        String[] shoppingList = {"Rice", "Apples", "Beans", "Bread", "Bananas"};
        System.out.print("\nShopping list items: ");
        for (String item : shoppingList) {
            if (item.equals(shoppingList[shoppingList.length - 1])) {
                System.out.print(item + ", ");
            } else {
                System.out.println(item);
            }
        }
        System.out.println();
        return shoppingList;
    }

    public static List<String> printChristmasList() {
        List<String> christmasList = new ArrayList<>(Arrays.asList("Fruits", "Books"));
        System.out.print("\nChristmas list items: ");
        for (String item : christmasList) {
            if (item.equals(christmasList.get(christmasList.size() - 1))) {
                System.out.print(item + ", ");
            } else {
                System.out.println(item);
            }
        }
        return christmasList;
    }

    public static void countAndPrintParity() {
        Random random = new Random();
        int arraySize = 10;
        int[] randomNumbers = new int[arraySize - 1];
        int generated = 0;
        System.out.println("\nAn array of 10 random numbers has been generated, with the following parity analysis");
        for (int index = 0; index < 9; index++) {
            generated = random.nextInt(1, 10);
            randomNumbers[index] = generated;
            if ((generated % 2) == 0) {
                System.out.println(generated + " is even.");
            } else {
                System.out.println(generated + " is odd.");
            }
        }
    }

    public static List<String> addCityNameToExistingList(List<String> savedCities) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (!savedCities.contains(city)) {
            savedCities.add(city);
        }
        System.out.println("The new city list is: ");
        printStringArrayList(savedCities, ", ");
        return savedCities;
    }

    public static void removeNameFromList(List<String> studentNames, String name) {
        if (studentNames.contains(name)) studentNames.remove(name);
    }

    public static void printStringArrayList(List<String> input, String delimiter) {
        for (String item : input) {
            System.out.print(item + delimiter);
        }
    }

    public static List<String> sortingListDescending(List<String> input) {
        for (int index1 = 0; index1 < input.size(); index1++) {
            for (int index2 = 0; index2 < input.size(); index2++) {
                if (index1 != index2) {
                    String item1 = input.get(index1);
                    String item2 = input.get(index2);
                    if (compareItems(item1, item2) > 0) {
                        input.set(index1, item2);
                        input.set(index2, item1);
                    }
                }
            }
        }
        return input;
    }

    public static int compareItems(String item1, String item2) {
        int lengthComparison = Integer.compare(item1.length(), item2.length());
        if (lengthComparison != 0) {
            return lengthComparison;
        } else {
            return item1.compareTo(item2);
        }
    }

    public static int linearSearchAlgorithm(List<String> input, String searchedItem) {
        for (int index = 0; index < input.size(); index++) {
            if (Objects.equals(input.get(index), searchedItem)) {
                return index;
            }
        }
        return -1;
    }

    public static int convertBinaryToDecimal(String inputBinary) {
        return Integer.parseInt(inputBinary, 2);
    }
}
