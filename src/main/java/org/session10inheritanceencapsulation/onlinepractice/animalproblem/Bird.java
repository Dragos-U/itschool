package org.session10inheritanceencapsulation.onlinepractice.animalproblem;

public class Bird extends Animal{

    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("This bird is eating.");
    }
}
