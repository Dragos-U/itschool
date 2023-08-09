package org.session4.homework;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(23);
        String adulthood = person.adulthoodOfPerson();
        System.out.println(adulthood);

        Temperature temperature = new Temperature();
        String perceivedTemperatureInCelsius = temperature.perceivedTemperatureEffect(24);
        temperature.displayPerceivedTemperatureEffect(perceivedTemperatureInCelsius);

        System.out.println(MathOperations.calculateFactorial(4));

        System.out.println(Triangle.triangleType(3, 3, 3));
    }
}


