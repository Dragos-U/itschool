package org.session11.homework.problem7;

import org.session11.homework.problem7.buildingcomponents.Room;
import org.session11.homework.problem7.managementsystems.AudioVideoSurveillance;

public class House {

    private Room livingRoom;
    private Room bathroom;
    private Room kitchen;
    private Room bedroom;
    private AudioVideoSurveillance surveillance;

    public House(Room livingRoom, Room bathroom, Room kitchen, Room bedroom, AudioVideoSurveillance surveillance) {
        this.livingRoom = livingRoom;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.surveillance = surveillance;
    }

    public AudioVideoSurveillance getSurveillance() {
        return surveillance;
    }

    public Room getLivingRoom() {
        return livingRoom;
    }

    public Room getBathroom() {
        return bathroom;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public Room getBedroom() {
        return bedroom;
    }

    @Override
    public String toString() {
        return "House{" +
                "livingRoom" +
                ", bathroom" +
                ", kitchen" +
                ", bedroom" +
                '}';
    }
}
