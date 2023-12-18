package org.session4operatorsandloops.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    Temperature temperature = new Temperature();

    @ParameterizedTest
    @CsvSource({
            "10, Cold",
            "22, Warm",
            "34, Hot"
    })
    void perceivedTemperatureEffectTest(int temperatureCelsius, String howIsFelt) {
        String result = temperature.perceivedTemperatureEffect(temperatureCelsius);
        assertEquals(howIsFelt, result);
    }
}
