package org.session4.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        listOne.add("a");
        listOne.add("b");
        listOne.add("c");

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("d","e","f"));

        System.out.println(listOne);
        System.out.println(listTwo);

        listTwo.addAll(listOne);
        listOne.add("x");
        System.out.println(listOne);
        System.out.println(listTwo);
    }
}
