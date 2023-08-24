package org.session8.onlinepractice;

public class WrapperClasses {

    public static void main(String[] args) {
        int number = 10;
        Integer number2 = Integer.valueOf(number);
        Integer autoboxedNumber = 10;

        String randomNumber = "12";
        Integer randomInteger = Integer.parseInt(randomNumber);

        printRoundedNumber("24.354");

    }

    public static void printRoundedNumber(String number){
        double doubleNumber = Double.parseDouble(number);
        long roundedNumber = Math.round(doubleNumber);
        System.out.println(roundedNumber);
    }
}
