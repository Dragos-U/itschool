package org.codingkata.week6;

public class MagicNumber {

    public static void main(String[] args) {
        String myDate = "2002-09-11";
        System.out.println(getMagicNumber(myDate));
    }

    public static int getMagicNumber(String input){
        int sum = 0;
        for (int index = 0; index < input.length(); index++){
            char currentChar = input.charAt(index);
            if (Character.isDigit(currentChar)){
                sum+= currentChar-'0';
            }
        }
        if (sum > 9) {
            return getMagicNumber(String.valueOf(sum));
        } else{
            return sum;
        }
    }
}
