package org.session5.onlinepractice;

import java.util.Scanner;

public class SwitchPractice {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;
    public static final int FRIDAY = 5;

    public static void main(String[] args) {
        System.out.println("Please enter a number from 1 to 7 to diplay the day of the week.");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a week day");
        }
    }
}
