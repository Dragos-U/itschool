package org.session9oop.homework.collegemanagementsystem;

public class Course {

    private String schedule;
    private int durationInMinutes;
    private String description;
    private Professor professor;

    public Course(String description, Professor professor, String schedule, int durationInMinutes ) {
        this.schedule = schedule;
        this.durationInMinutes = durationInMinutes;
        this.description = description;
        this.professor = professor;
    }

    public Course(){}

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessor() {
        return professor.getFirstName() + professor.getLastName();
    }

    @Override
    public String toString() {
        return "Course{" +
                "description='" + description+ '\'' +
                ", professor='" + professor.getFirstName() + " " + professor.getLastName() + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", schedule='" + schedule + '\'' +
                '}';

    }
}
