package org.codingkata.week6;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        myStack.push("first");
        myStack.push("second");
        myStack.push("third");

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
