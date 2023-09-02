package org.session11.homework.problem7.managementsystems;

public class Thermostat {

    private int ambientTemperatureDegC;

    public int getAmbientTemperatureDegC() {
        return ambientTemperatureDegC;
    }

    public void setAmbientTemperatureDegC(int ambientTemperatureDegC) {
        this.ambientTemperatureDegC = ambientTemperatureDegC;
    }

    public Thermostat(int ambientTemperature) {
        this.ambientTemperatureDegC = ambientTemperature;
    }
}
