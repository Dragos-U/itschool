package org.session9oop.homework.schoolgradebook;

import java.util.ArrayList;
import java.util.List;

public class CourseGradeBook {

    private List<Student> students;

    public CourseGradeBook() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printCourseGPA() {
        int gradeSum = 0;
        for (Student student : students) {
            gradeSum += student.getGradePointAverage();
        }
        System.out.println("\nThe average grade per course is: " + gradeSum / students.size());
    }

    public void printStudentGPA() {
        for (Student student : students) {
            System.out.println(student.getFullName() + " GPA is : " + student.getGradePointAverage());
        }
    }


}
