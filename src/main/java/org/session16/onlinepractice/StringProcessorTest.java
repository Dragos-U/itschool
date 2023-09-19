package org.session16.onlinepractice;

public class StringProcessorTest {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = str -> str.replace(" ","");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.andThen(toUpperCase);
        System.out.println(combined.process("hello lume buna si voioasa care nu iasa din casa."));
    }
}
