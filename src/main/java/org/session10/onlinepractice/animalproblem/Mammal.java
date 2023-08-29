package org.session10.onlinepractice.animalproblem;

public class Mammal extends Animal{

    public Mammal(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The mammal is eating.");
    }
}
