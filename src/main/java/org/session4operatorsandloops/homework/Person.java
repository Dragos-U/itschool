package org.session4operatorsandloops.homework;

public class Person {

    int age;
    public Person(int age) {
        this.age = age;
    }

    public String adulthoodOfPerson() {
        return age >= 18 ? "I am adult." : "I am not adult.";
    }
}
