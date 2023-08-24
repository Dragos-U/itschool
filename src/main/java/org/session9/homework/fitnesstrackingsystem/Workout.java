package org.session9.homework.fitnesstrackingsystem;

public class Workout {

    private String type;
    private double duration;
    private double distance;
    private double liftedWeight;

    public Workout(String type, double duration, double distance, double liftedWeight){
        this.type = type;
        this.duration = duration;
        this.distance = distance;
        this.liftedWeight = liftedWeight;
    }

    public String getType(){
        return type;
    }
    public double getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public double getLiftedWeight() {
        return liftedWeight;
    }

    public void setLiftedWeight(float liftedWeight) {
        this.liftedWeight = liftedWeight;
    }

    @Override
    public String toString() {
        return "\n" + type +
                ", duration=" + duration +
                ", distance=" + distance +
                ", liftedWeight=" + liftedWeight ;
    }
}
