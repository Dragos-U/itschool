package org.session11.homework.problem7.managementsystems;

public class LockingSystem {

    private boolean isLocked;

    public LockingSystem(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }
}
