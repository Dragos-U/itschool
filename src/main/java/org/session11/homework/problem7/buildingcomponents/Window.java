package org.session11.homework.problem7.buildingcomponents;

import org.session11.homework.problem7.managementsystems.LockingSystem;

public class Window {

    private LockingSystem lockingSystem;
    private boolean isOpen;

    public Window(boolean isOpen, LockingSystem lockingSystem) {
        this.isOpen = isOpen;
        this.lockingSystem = lockingSystem;
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
