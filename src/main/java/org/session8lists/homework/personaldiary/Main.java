package org.session8lists.homework.personaldiary;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setName("John");

        Diary diaryEntry1 = new Diary();
        LocalDate localDate1 = LocalDate.now();
        String input1 = "First diary input";
        diaryEntry1.setLocalDate(localDate1);
        diaryEntry1.setTextInput(input1);

        Diary diaryEntry2 = new Diary();
        LocalDate localDate2 = LocalDate.now().plusDays(1);
        String input2 = "Second diary input";
        diaryEntry2.setLocalDate(localDate2);
        diaryEntry2.setTextInput(input2);

        user1.addDiaryEntry(diaryEntry1);
        user1.addDiaryEntry(diaryEntry2);

        user1.printDiaryEntries();

        user1.deleteDiaryEntry(LocalDate.now().plusDays(1));
        user1.printDiaryEntries();

        Diary diaryEntry3 = new Diary();
        LocalDate localDate3 = LocalDate.now();
        String input3 = "Modified First diary input";
        diaryEntry3.setLocalDate(localDate3);
        diaryEntry3.setTextInput(input3);

        user1.editDiaryEntry(diaryEntry3);
        user1.printDiaryEntries();
        
    }
}
