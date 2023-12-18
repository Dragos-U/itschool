package org.session9oop.homework.collegemanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String firstName;
    private String lastName;
    private char sex;
    private LocalDate dateOfBirth;
    private String CNP;
    private String address;
    private List<Course> courses;

    public Professor() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void printCourses() {
        System.out.print("\n\nProf. "+ firstName+" "+lastName+" teaches the following courses: ");
        for (Course course : courses) {
            System.out.print(" "+course.getDescription()+", ");

        }
    }


    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getCNP() {
        return CNP;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Professor{" + "firsName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' + '}';
    }
}
