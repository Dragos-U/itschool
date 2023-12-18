package org.session10inheritanceencapsulation.homework.animalmanagement;

public class Dog extends Animal {

    @Override
    protected void sound() {
        System.out.println("bark");
    }
}