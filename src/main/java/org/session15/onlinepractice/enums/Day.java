package org.session15.onlinepractice.enums;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true);

    private boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday(){
        return isWeekday;
    }


}
