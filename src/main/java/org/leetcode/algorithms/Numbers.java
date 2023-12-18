package org.leetcode.algorithms;

public class Numbers {

    public static void main(String[] args) {
        int number = 4;
        int sum = sumAllTo(number);
        System.out.println("The sum of the first " + number + " numbers is: "+sum);
    }

    private static int sumAllTo(int input){
        if(input == 0){
            return 0;
        } else {
            return sumAllTo(input-1) + input;
        }
    }
}
