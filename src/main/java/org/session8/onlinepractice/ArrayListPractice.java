package org.session8.onlinepractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Lex");


        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty?"+isListEmpty);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names);

    }
}
