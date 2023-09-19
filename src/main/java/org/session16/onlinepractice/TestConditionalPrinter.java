package org.session16.onlinepractice;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (input, condition) -> {
            if (condition) {
                System.out.println(input);
            }
        };

        conditionalPrinter.print("Hello John", true);
        conditionalPrinter.print("Hello Jamie", false);
    }
}
