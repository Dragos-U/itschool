package org.session15.onlinepractice.enums;

public class EnumsPractice {

    public static void main(String[] args) {
        printEnumValues();
        message(Day.WEDNESDAY);
    }

    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println(day + " is weekday ? " + day.isWeekday());
        }
    }

    private static void message(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week ");
            case TUESDAY -> System.out.println("Go to work");
            default -> System.out.println("Just another day");
        }
    }
}
