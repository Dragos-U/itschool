package org.session11abstraction.homework.problem4;

public abstract class A {

    public A(){
        System.out.println("This is a constructor class.");
    }

    abstract void a_method();
    void printMessage(){
        System.out.println("This is a normal method of abstract class");
    }
}
