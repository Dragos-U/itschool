package org.session14.onlinepractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        myList = updateList(myList, 0, 25);
        System.out.println("\n" + myList);
        boolean isValuePresent = searchElement(myList, 8);
        System.out.println("Is the number 8 present ? " + isValuePresent);
        System.out.println("Even numbers : " + filterEvenNumbers(myList));
        System.out.println("Maximum is :" + findMaximum(myList));
    }

    private static List<Integer> initializeList() {
        List<Integer> myList = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            myList.add(index);
        }
        myList.forEach(e -> System.out.print(" " + e));
        return myList;
    }

    private static List<Integer> updateList(List<Integer> list, int index, int value) {
        if (index < 0 || index >= list.size()) {
            return list;
        }
        list.set(index, value);
        return list;
    }

    private static boolean searchElement(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static Integer findMaximum(List<Integer> list) {
        if (list == null) return null;
        int maxValue = list.get(0);
        for (int number : list) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue; // does autoboxing to Integer
    }
}
