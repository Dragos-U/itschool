package org.session17stream.homework;

import java.util.Arrays;
import java.util.List;

public class Problem5 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17));
        List<Person> adults = findAdultPersons(people);
        adults.forEach(adult -> System.out.println(adult.toString()));
    }

    public static List<Person> findAdultPersons(List<Person> people){
        return  people
                .stream()
                .filter(person -> person.getAge() >= 18)
                .toList();
    }
}
