package org.session4.homework;

public class Person {

    int age;

    public Person(int age){
        this.age = age;
    }

    public String displayIfThePersonIsAdult(){
        return age >= 18 ? "I am adult." : "I am not adult.";
    }
}
