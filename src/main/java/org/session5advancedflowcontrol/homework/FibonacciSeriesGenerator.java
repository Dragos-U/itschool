package org.session5advancedflowcontrol.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeriesGenerator {

    private FibonacciSeriesGenerator() {
        throw new IllegalStateException("Utility class should not be instantiated");
    }

    public static ArrayList<Integer> generateTheFibonacciSeries(int firstNNumbersToGenerate) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        switch (firstNNumbersToGenerate) {
            case 0 -> {}
            case 1 -> fibonacciSeries.add(0);
            case 2 -> fibonacciSeries.add(1);
            default -> {
                fibonacciSeries.addAll(Arrays.asList(0, 1));
                for (int index = 2; index < firstNNumbersToGenerate; index++) {
                    fibonacciSeries.add(index, fibonacciSeries.get(index - 1) + fibonacciSeries.get(index - 2));
                }
            }
        }
        return (ArrayList<Integer>) fibonacciSeries;
    }
}
