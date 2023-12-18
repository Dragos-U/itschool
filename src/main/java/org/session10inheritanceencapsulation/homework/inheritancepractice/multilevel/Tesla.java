package org.session10inheritanceencapsulation.homework.inheritancepractice.multilevel;

public class Tesla extends ElectricCar {

    private boolean autopilot;
    private double autopilotVersion;

    public Tesla(String model, int year) {
        super("Tesla", model, year);
    }

    public double getAutopilotVersion() {
        return autopilotVersion;
    }

    public void setAutopilotVersion(double autopilotVersion) {
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        autopilot = true;
        System.out.println("    Enabling autopilot");
    }

    public void disableAutopilot() {
        autopilot = false;
        System.out.println("    Disabling autopilot");
    }

    public boolean getAutopilot() {
        return autopilot;
    }
}