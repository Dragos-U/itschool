package org.session8.homework.personaldiary;

import java.time.LocalDate;

public class Diary {

    private LocalDate date;
    private String textInput;

    public LocalDate getDate() {
        return date;
    }

    public void setLocalDate(LocalDate date) {
        this.date = date;
    }

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    @Override
    public String toString(){
        return date + ": " + textInput;
    }
}
