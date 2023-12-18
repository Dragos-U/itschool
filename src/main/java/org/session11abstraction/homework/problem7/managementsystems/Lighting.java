package org.session11abstraction.homework.problem7.managementsystems;

public class Lighting {

    private boolean isSwitchedOn;

    public Lighting(boolean isSwitchedOn) {
        this.isSwitchedOn = isSwitchedOn;
    }

    public void dimLights() {
        System.out.println(" >> The lights were dimmed");
    }

    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        isSwitchedOn = switchedOn;
    }
}
