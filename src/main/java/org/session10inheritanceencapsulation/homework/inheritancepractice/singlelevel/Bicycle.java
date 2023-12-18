package org.session10inheritanceencapsulation.homework.inheritancepractice.singlelevel;

public class Bicycle {

    private int speed;
    private int gear;

    public Bicycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }
    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int speedIncrement){
        speed += speedIncrement;
    }

    public void applyBrake(int speedDecrement){
        speed -= speedDecrement;
    }

    public int getSpeed(){
        return speed;
    }

    public int getGear(){
        return gear;
    }
}
