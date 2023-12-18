package org.session8lists.onlinepractice;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 8, 2, 13, 56, 23, 5};
        int target = 5;

        Arrays.sort(myArray);
        int result = binarySearch(myArray, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] array, int target) {
        int leftSide = 0;
        int rightSide = array.length - 1;

        while(leftSide <= rightSide){
            int middle = leftSide + (rightSide - leftSide) / 2;

            if(array[middle]==target){
                return middle;
            } else if (array[middle] < target) {
                leftSide = middle + 1;
            } else {
                rightSide = middle - 1;
            }
        }
        return -1;
    }
}
