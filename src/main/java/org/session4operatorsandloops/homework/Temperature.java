package org.session4operatorsandloops.homework;

public class Temperature {

    public String perceivedTemperatureEffect(int temperatureCelsius ) {
        if (temperatureCelsius > 30){
            return "Hot";
        } else if (temperatureCelsius <= 30 && temperatureCelsius >= 20) {
            return "Warm";
        } else {
            return "Cold";
        }
    }

    public void displayPerceivedTemperatureEffect(String s){
        System.out.println(s);
    }
}
