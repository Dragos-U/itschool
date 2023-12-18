package org.session5advancedflowcontrol.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Testing the generation of Fibonacci Series")
class FibonacciSeriesGeneratorTest {

    @Test
    @DisplayName("The Fibonacci Series is successfully generated")
    void generateTheFibonacciSeriesTest(){
        List<Integer> listFibonacciSeries = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        assertEquals(listFibonacciSeries, FibonacciSeriesGenerator.generateTheFibonacciSeries(11));
    }
}
