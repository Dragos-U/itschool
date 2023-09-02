package org.session11.homework.problem7.buildingcomponents;

import org.session11.homework.problem7.managementsystems.LockingSystem;

public class Door {

    private LockingSystem lockingSystem;

    private boolean isOpen;

    public Door(boolean isOpen, LockingSystem lockingSystem) {
        this.isOpen = isOpen;
        this.lockingSystem = lockingSystem;
    }

    public Door() {
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public LockingSystem getLockingSystem() {
        return lockingSystem;
    }
}
