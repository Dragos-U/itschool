package org.session8lists.onlinepractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
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
