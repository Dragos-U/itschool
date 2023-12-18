package org.session10inheritanceencapsulation.homework.inheritancepractice.hierarchical;

public class WatercraftManagement {

    public static void main(String[] args) {
        SpeedBoat speedBoat = new SpeedBoat();
        speedBoat.setLength(30);
        speedBoat.setWeight(10);
        speedBoat.setMaxSpeed(70);
        System.out.println("The speed boat is " + speedBoat.getLength() + " m long and weights " + speedBoat.getWeight() + " tons");
        System.out.println("The speed boat is " + speedBoat.getMaxSpeed()+ " miles per hour");

        speedBoat.sail();
        speedBoat.turboBoostOn();
        speedBoat.turboBoostOff();

        FishingBoat fishingBoat = new FishingBoat();
        fishingBoat.setLength(50);
        fishingBoat.setWeight(40);
        fishingBoat.setFishCapacity(10);
        fishingBoat.setTypeOfNet(FishNet.GILL_NET);
        System.out.println("\nThe fishing boat is " + fishingBoat.getLength() + " m long and weights " + fishingBoat.getWeight() + " tons");
        System.out.println("The fishing boat has a fish capacity of "+fishingBoat.getFishCapacity()+" tons");

        fishingBoat.sail();
        fishingBoat.castNet();
    }
}