package org.session10.homework.inheritancepractice.hierarchical;

public class FishingBoat extends Boat {

    private int fishCapacity;
    private FishNet typeOfNet;

    public int getFishCapacity() {
        return fishCapacity;
    }

    public void setFishCapacity(int fishCapacity) {
        this.fishCapacity = fishCapacity;
    }

    public FishNet getTypeOfNet() {
        return typeOfNet;
    }

    public void setTypeOfNet(FishNet typeOfNet) {
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("The " + getTypeOfNet() + " is thrown.");
    }
}