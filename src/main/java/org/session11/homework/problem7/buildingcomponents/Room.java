package org.session11.homework.problem7.buildingcomponents;

import org.session11.homework.problem7.managementsystems.Lighting;
import org.session11.homework.problem7.managementsystems.Thermostat;

public class Room {

    private Window window;
    private Door door;
    private Lighting lighting;
    private Thermostat thermostat;

    public Room(Window window, Door door, Lighting lighting, Thermostat thermostat) {
        this.window = window;
        this.door = door;
        this.lighting = lighting;
        this.thermostat = thermostat;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Lighting getLighting() {
        return lighting;
    }

    public Thermostat getThermostat() {
        return thermostat;
    }
}
