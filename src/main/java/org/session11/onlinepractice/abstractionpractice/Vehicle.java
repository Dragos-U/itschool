package org.session11.onlinepractice.abstractionpractice;

public abstract class Vehicle {

    private double speed;

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    public abstract void start();

    public final void stop(){
        speed = 0;
    }
}

interface Safety{

    void airbags();
    void antiFogSystem();
}

class Car extends Vehicle implements Safety{

    @Override
    public void start(){
        System.out.println("Start the engine.");
    }

    @Override
    public void airbags() {
        System.out.println("Airbags are available.");
    }

    @Override
    public void antiFogSystem() {
        System.out.println("AntiFog system is present.");
    }
}

class Bicycle extends Vehicle{

    @Override
    public void start() {
        System.out.println("Start pedaling.");
    }
}