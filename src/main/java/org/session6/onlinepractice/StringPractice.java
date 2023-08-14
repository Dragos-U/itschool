package org.session6.onlinepractice;

import org.w3c.dom.ls.LSOutput;

public class StringPractice {

    public static void main(String[] args) {
//        testingStrings();
//        garbageCollectorExample();

//        System.out.println(getStringLength("Andrei"));
//
        String  fullName = "AlexIliescu";
//        String firstName = fullName.substring(0,4);
//        System.out.println(firstName);

        System.out.println(getStringStartsWith(fullName,"A"));

        String sentence = "I like to eat apple pie.";

        boolean containsPhrase = sentence.contains("apple");
        System.out.println(containsPhrase);

        System.out.println(sentence.replace("i","u"));
        System.out.println(sentence.trim());


    }

    private static void testingStrings() {
        String animal1 = "lion";
        String animal2 = new String("lion");
        String animal3 = "lion";

        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal3));

        System.out.println("animal1 hashcode "+ Integer.toHexString(System.identityHashCode(animal1)));
        System.out.println("animal2 hashcode "+ Integer.toHexString(System.identityHashCode(animal2)));
        System.out.println("animal3 hashcode "+ Integer.toHexString(System.identityHashCode(animal3)));
    }

    public static void garbageCollectorExample(){
        String name = "Vlad";
        System.out.println(name);

        name = "Ciuca";
        System.out.println(name);
    }

    public static int getStringLength(String input){
        return input.length();
    }

    public static boolean getStringStartsWith (String input, String startsWith){
        return input.startsWith(startsWith);
    }

    public static boolean getStringEndsWith (String input, String endsWith){
        return input.endsWith(endsWith);
    }
}
