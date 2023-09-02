package org.session11.homework.problem7;

import org.session11.homework.problem7.buildingcomponents.Door;
import org.session11.homework.problem7.buildingcomponents.Room;
import org.session11.homework.problem7.buildingcomponents.Window;
import org.session11.homework.problem7.managementsystems.AudioVideoSurveillance;
import org.session11.homework.problem7.managementsystems.Lighting;
import org.session11.homework.problem7.managementsystems.LockingSystem;
import org.session11.homework.problem7.managementsystems.Thermostat;
import org.session11.homework.problem7.user.AdminRights;
import org.session11.homework.problem7.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User father = new User("Fin", AdminRights.full_control);
        User mother = new User("Jill", AdminRights.partial_control);
        User child = new User("Jake", AdminRights.limited_control);
        User cousin = new User("Clide", AdminRights.limited_control);
        List<User> homeUsers = new ArrayList<>(Arrays.asList(father, mother, child, cousin));

        LockingSystem windowLockingSystem = new LockingSystem(false);
        LockingSystem doorLockingSystem = new LockingSystem(false);

        Window livingRoomWindow = new Window(false, windowLockingSystem);
        Door livingRoomExteriorDoor = new Door(true, doorLockingSystem);
        Lighting livingRoomLighting = new Lighting(false);
        Thermostat livingRoomThermostat = new Thermostat(22);

        Window bathroomWindow = new Window(false, windowLockingSystem);
        Door bathroomDoor = new Door();
        Lighting bathroomLighting = new Lighting(false);
        Thermostat bathroomThermostat = new Thermostat(20);

        Window kitchenWindow = new Window(true, windowLockingSystem);
        Door kitchenDoor = new Door();
        Lighting kitchenLighting = new Lighting(true);
        Thermostat kitchenThermostat = new Thermostat(18);

        Window bedroomWindow = new Window(true, windowLockingSystem);
        Door bedroomExteriorDoor = new Door(false, doorLockingSystem);
        Lighting bedroomLighting = new Lighting(false);
        Thermostat bedroomThermostat = new Thermostat(17);

        Room livingRoom = new Room(livingRoomWindow, livingRoomExteriorDoor, livingRoomLighting, livingRoomThermostat);
        Room bathroom = new Room(bathroomWindow, bathroomDoor, bathroomLighting, bathroomThermostat);
        Room kitchen = new Room(kitchenWindow, kitchenDoor, kitchenLighting, kitchenThermostat);
        Room bedroom = new Room(bedroomWindow, bedroomExteriorDoor, bedroomLighting, bedroomThermostat);
        List<Room> rooms = new ArrayList<>(Arrays.asList(livingRoom, bathroom, kitchen, bedroom));
        AudioVideoSurveillance surveillance = new AudioVideoSurveillance(false);
        House house = new House(livingRoom, bathroom, kitchen, bedroom, surveillance);

        Home home = new Home(homeUsers, house);

        System.out.println("The registered users of the house are: " + homeUsers.toString());
        System.out.println("The house is made of the following rooms: " + house.toString());

        System.out.println(" > Dim the lights in the kitchen");
        boolean isKitchenLightingOn = house.getKitchen().getLighting().isSwitchedOn();
        if (isKitchenLightingOn) {
            house.getKitchen().getLighting().dimLights();
        } else {
            System.out.println(" >> The lighting was off.");
        }

        System.out.println("----------------------");
        System.out.println(" > Locking the house...");
        for (Room room : rooms) {
            room.getDoor().setOpen(false);
            room.getWindow().setOpen(false);
        }
        windowLockingSystem.lock();
        doorLockingSystem.lock();
        System.out.println(" >> All windows are locked :" + windowLockingSystem.isLocked());
        System.out.println(" >> All doors are locked :" + doorLockingSystem.isLocked());

        System.out.println("----------------------");
        System.out.println(" >> The surveillance system ON : " + house.getSurveillance().getState());
        System.out.println(" > Setting ON the surveillance system...");
        house.getSurveillance().setSurveillanceOn();
        System.out.println(" >> The surveillance system ON : " + house.getSurveillance().getState());
    }
}
