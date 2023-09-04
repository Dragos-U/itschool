package org.session11.homework.problem7.managementsystems;

public class AudioVideoSurveillance {

    private boolean isSurveillanceOn;

    public AudioVideoSurveillance(boolean isSurveillanceOn) {
        this.isSurveillanceOn = isSurveillanceOn;
    }

    public void setSurveillanceOn(){
        isSurveillanceOn = true;
    }

    public void setSurveillanceOff(){
        isSurveillanceOn = false;
    }

    public boolean getState() {
        return isSurveillanceOn;
    }
}
