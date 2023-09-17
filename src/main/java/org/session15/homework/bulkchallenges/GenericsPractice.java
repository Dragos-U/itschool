package org.session15.homework.bulkchallenges;

import java.util.Arrays;

public class GenericsPractice {

    public static <T> T[] swapPosition(T[] array, int firstIndex, int secondIndex) {
        if (firstIndex <= 0 || secondIndex <= 0 || firstIndex >= array.length || secondIndex >= array.length) {
            throw new IllegalArgumentException("Invalid Index.");
        }

        T[] output = Arrays.copyOf(array, array.length);
        T temp = array[firstIndex];
        output[firstIndex] = output[secondIndex];
        output[secondIndex] = temp;
        return output;
    }
}

class TestGenericsPractice {

    public static void main(String[] args) {
        Integer[] integers = {1, 3, 4, 5};
        String[] strings = {"a", "b", "c"};

        Integer[] swapIntegers = GenericsPractice.swapPosition(integers, 2, 3);
        String[] swapStrings = GenericsPractice.swapPosition(strings, 1, 2);

        Arrays.stream(integers).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(swapIntegers).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(swapStrings).forEach(e -> System.out.print(e + " "));
    }
}
