package org.session10inheritanceencapsulation.homework.animalmanagement;

public class Cat extends Animal {

    @Override
    protected void sound() {
        System.out.println("meow");
    }
}