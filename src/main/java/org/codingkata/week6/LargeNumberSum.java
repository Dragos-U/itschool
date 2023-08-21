package org.codingkata.week6;

public class LargeNumberSum {


    public static void main(String[] args) {
        String firstNumber = "9999";
        String secondNumber = "111";

        System.out.println(addNumbers(firstNumber, secondNumber));
        System.out.println(addLargeNumbers(firstNumber, secondNumber));
    }

    public static String addNumbers(String num1, String num2) {
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;

        String result = "";
        int carry = 0;
        while (num1Index >= 0 && num2Index >= 0) {
            int num1Digit = num1.charAt(num1Index) - '0';
            int num2Digit = num2.charAt(num2Index) - '0';
            int addition = num1Digit + num2Digit;
            result += ((carry + addition) % 10);
            if (addition > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
            num1Index--;
            num2Index--;
        }
        if (num1Index < 0) {
            while (num2Index >= 0) {
                int num2Digit = num2.charAt(num2Index) - '0';
                result += ((carry + num2Digit) % 10);
                if ((num2Digit + carry) > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                num2Index--;
            }
        } else {
            while (num1Index >= 0) {
                int num1Digit = num1.charAt(num1Index) - '0';
                result += ((carry + num1Digit) % 10);
                if ((num1Digit + carry) > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                num1Index--;
            }
        }
        if (carry == 1)
            result += carry;

        return new StringBuilder(result).reverse().toString();
    }

    public static String addLargeNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }

        return result.toString();
    }
}
