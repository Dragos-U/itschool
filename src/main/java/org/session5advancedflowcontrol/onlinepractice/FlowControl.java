package org.session5advancedflowcontrol.onlinepractice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
//        printNumberWithWhile(10);
//        System.out.println();
//        printNumberWithDoWhile(10);
//        System.out.println();
//        printNumberWithFor(10);

        List<String> list = new ArrayList<>();
        list.add("Timisoara");
        list.add("Iasi");
        list.add("Bucuresti");

        printListWithFor(list);
    }

    public static void printNumberWithWhile(int input) {
        int number = 0;
        while (number < input) {
            number++;
            if (number == input) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 0;
        do {
            number++;
            if (number == input) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }
        } while (number < input);
    }

    public static void printNumberWithFor(int input) {
        for (int index = 1; index <= input; index++) {
            if (index == input) {
                System.out.print(index);
            } else {
                System.out.print(index + ", ");
            }
        }
    }

    public static void printListWithFor(List<String> list) {
        int listSize = list.size();
        int count = 0;
        for (String element : list) {
            count++;
            if (count == listSize) {
                System.out.println(element);
            } else {
                System.out.print(element + ", ");
            }
        }
    }
}
