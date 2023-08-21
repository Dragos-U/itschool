package org.session8.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WorkingWithArraysAndLists.printShoppingList();
        WorkingWithArraysAndLists.printChristmasList();
        WorkingWithArraysAndLists.countAndPrintParity();

        List<String> savedCities = new ArrayList<>(Arrays.asList("London", "Paris", "Barcelona", "Rome", "Patras"));
        System.out.print("\nCurrently there are " + savedCities.size() + " cities saved, as follows:");
        WorkingWithArraysAndLists.printStringArrayList(savedCities, ", ");
        System.out.println("\nEnter new city to be added to the list:");
        WorkingWithArraysAndLists.addCityNameToExistingList(savedCities);
        WorkingWithArraysAndLists.printStringArrayList(savedCities, ", ");

        List<String> studentNames = new ArrayList<>(Arrays.asList("Doe", "John", "Ben"));
        System.out.println("\nThe old student list contains this names:");
        WorkingWithArraysAndLists.printStringArrayList(studentNames, " ");
        WorkingWithArraysAndLists.removeNameFromList(studentNames, "Ben");
        System.out.println("\nThe new student list contains this names:");
        WorkingWithArraysAndLists.printStringArrayList(studentNames, " ");

        List<String> fruitNames = new ArrayList<>(Arrays.asList("Apple", "Peach", "Orange", "Banana", "Strawberry"));
        System.out.println("\nThe initial list of fruits is:");
        WorkingWithArraysAndLists.printStringArrayList(fruitNames, " ");
        List<String> sortedFruitNames = WorkingWithArraysAndLists.sortingListDescending(fruitNames);
        System.out.println("\nThe sorted list of fruits is:");
        WorkingWithArraysAndLists.printStringArrayList(sortedFruitNames, " ");

        List<String> movies = new ArrayList<>(Arrays.asList("Armageddon", "Terminator", "Matrix", "Shinning"));
        System.out.println("\nThe movie list is: ");
        String searchedMovie = "Matrix";
        WorkingWithArraysAndLists.printStringArrayList(movies, " ");
        int movieIndex = WorkingWithArraysAndLists.linearSearchAlgorithm(movies, searchedMovie);
        if (movieIndex >= 0) {
            System.out.println("\n" + searchedMovie + " exists in the list at position " + movieIndex);
        } else {
            System.out.println("\n" + searchedMovie + " does not exist in the list");
        }

        String binaryString = "1111";
        int decimal = WorkingWithArraysAndLists.convertBinaryToDecimal(binaryString);
        System.out.println("\nBinary value: " + binaryString);
        System.out.println("Decimal value: " + decimal);


    }
}
