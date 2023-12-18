package org.session10inheritanceencapsulation.homework.inheritancepractice.multilevel;

public class ElectricCar extends Car{

    private int batteryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year){
        super(make, model, year);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void charge(){
        System.out.println("The electric car is charging its batteries.");
    }
}
