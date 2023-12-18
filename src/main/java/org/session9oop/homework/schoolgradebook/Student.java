package org.session9oop.homework.schoolgradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private String fullName;
    private UUID id;
    private List<Integer> grades = new ArrayList<>();

    public Student(String fullName) {
        id = UUID.randomUUID();
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void addGrade(Integer grade) {
        grades.add(grade);
    }

    public float getGradePointAverage() {
        int sum = 0;
        for (int value : grades) {
            sum += value;
        }
        return (float) sum / grades.size();
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
