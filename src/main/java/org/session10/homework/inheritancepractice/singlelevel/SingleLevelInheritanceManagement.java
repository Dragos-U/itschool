package org.session10.homework.inheritancepractice.singlelevel;

public class SingleLevelInheritanceManagement {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(0, 1);
        MountainBike mountainBike = new MountainBike(0, 2);

        System.out.println("Bicycle speed: "+ bicycle.getSpeed()+ "km/h");
        int speedIncrement = 5;
        System.out.println("    Increase speed by "+speedIncrement+"km/h");
        bicycle.speedUp(speedIncrement);
        System.out.println("Bicycle speed: "+ bicycle.getSpeed()+ "km/h");

        System.out.println("Bicycle gear: "+ bicycle.getGear());
        int newGear = 3;
        System.out.println("    Change gear to "+newGear);
        bicycle.changeGear(newGear);
        System.out.println("Bicycle gear: "+ bicycle.getGear());

        System.out.println("Mountain bike speed: "+ mountainBike.getSpeed()+ "km/h");
        speedIncrement = 10;
        System.out.println("    Increase speed by "+speedIncrement+"km/h");
        mountainBike.speedUp(speedIncrement);
        System.out.println("Mountain bike speed: "+ mountainBike.getSpeed()+ "km/h");
    }
}
