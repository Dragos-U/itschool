package org.session10.homework.inheritancepractice.multilevel;

public abstract class Car {

    private int speed;
    private final String make;
    private final String model;
    private final int year;

    protected Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The car is starting.");
    }

    public void stop() {
        System.out.println("The car is stopping.");
    }

    public void accelerate(int speedIncrement) {
        speed += speedIncrement;
        System.out.println("...accelerating");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}