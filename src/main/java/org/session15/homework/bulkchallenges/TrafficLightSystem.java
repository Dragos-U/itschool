package org.session15.homework.bulkchallenges;

public class TrafficLightSystem {

    public static void printActionToBeTaken(LightColor trafficLightColor) {
        if (trafficLightColor == null) {
            throw new IllegalArgumentException("Invalid traffic light color.");
        }
        switch (trafficLightColor) {
            case red -> System.out.println(trafficLightColor.getName());
            case yellow -> System.out.println(trafficLightColor.getName());
            case green -> System.out.println(trafficLightColor.getName());
            default -> System.out.println("Not a traffic light color.");
        }
    }
}

class TestTrafficLightSystem {

    public static void main(String[] args) {
        LightColor trafficLightColor = LightColor.red;
        TrafficLightSystem.printActionToBeTaken(trafficLightColor);

        trafficLightColor = LightColor.green;
        TrafficLightSystem.printActionToBeTaken(trafficLightColor);
    }
}
