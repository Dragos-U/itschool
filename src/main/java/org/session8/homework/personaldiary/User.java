package org.session8.homework.personaldiary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {

    private String name;
    private List<Diary> userDiary = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDiaryEntry(Diary diary) {
        for (Diary existingEntry : userDiary) {
            if (existingEntry.getDate().equals(diary.getDate())) {
                System.out.println("An entry already exists.");
                return;
            }
        }
        userDiary.add(diary);
        System.out.println("Entry added.");
    }

    public void editDiaryEntry(Diary diary) {
        for (Diary entry : userDiary) {
            if (entry.getDate().equals(diary.getDate())) {
                entry.setTextInput(diary.getTextInput());
                System.out.println("Enty edited.");
                return;
            }
        }
        System.out.println("No entry found for this date.");
    }

    public void deleteDiaryEntry(LocalDate date) {
        for (Diary entry : userDiary) {
            if (entry.getDate().equals(date)) {
                userDiary.remove(entry);
                System.out.println("Entry deleted successfully");
                return;
            }
        }
        System.out.println("No entry found for this date.");
    }

    public void printDiaryEntries() {
        if (userDiary.isEmpty()) {
            System.out.println("Diary is empty.");
        } else {
            Collections.sort(userDiary, Comparator.comparing(Diary::getDate).reversed());
            for (Diary entry : userDiary) {
                System.out.println(entry);
            }
        }
    }
}
