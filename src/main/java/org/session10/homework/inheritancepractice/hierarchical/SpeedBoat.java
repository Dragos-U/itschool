package org.session10.homework.inheritancepractice.hierarchical;

public class SpeedBoat extends Boat {

    private int maxSpeed;
    private String engineType;

    public void turboBoostOn() {
        System.out.println("TurboBoost mode activated");
    }

    public void turboBoostOff() {
        System.out.println("TurboBoost mode deactivated");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
