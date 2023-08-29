package org.session10.homework.inheritancepractice.multilevel;

public class CarManagement {

    public static void main(String[] args) {
        Tesla tesla = new Tesla("Model3", 2022);
        tesla.setBatteryCapacity(57);
        tesla.setRange(600);

        System.out.println("Hello. You are driving a " +
                tesla.getMake() + " " +
                tesla.getModel() + " from " +
                tesla.getYear() + " with a battery capacity of " +
                tesla.getBatteryCapacity() + " kWh");

        System.out.println("The current range is " + tesla.getRange() + " km");

        tesla.start();
        tesla.setSpeed(60);
        int speed = tesla.getSpeed();
        System.out.println("The car runs at " + speed + " km/h");

        tesla.accelerate(10);
        speed = tesla.getSpeed();
        System.out.println("The car runs at " + speed + " km/h");

        boolean isAutopilotOn = tesla.getAutopilot();
        System.out.println("The autopilot is on : " + isAutopilotOn);

        tesla.enableAutopilot();
        isAutopilotOn = tesla.getAutopilot();
        System.out.println("The autopilot is on : " + isAutopilotOn);

        tesla.stop();
    }
}
