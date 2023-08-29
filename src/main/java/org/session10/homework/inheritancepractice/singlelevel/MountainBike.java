package org.session10.homework.inheritancepractice.singlelevel;

public class MountainBike extends Bicycle {

    private String tireType;
    private int suspension;

    public MountainBike(int speed, int gear) {
        super(speed, gear);
    }

    public void adjustSuspension(int newSuspensionValue) {
        suspension = newSuspensionValue;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getSuspension() {
        return suspension;
    }
}