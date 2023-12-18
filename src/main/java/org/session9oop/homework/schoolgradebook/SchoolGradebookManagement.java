package org.session9oop.homework.schoolgradebook;

public class SchoolGradebookManagement {

    public static void main(String[] args) {
        Student student1 = new Student("John Doe");
        student1.addGrade(10);
        student1.addGrade(9);
        student1.addGrade(8);
        student1.addGrade(7);

        Student student2 = new Student("Jane Doe");
        student2.addGrade(10);
        student2.addGrade(10);
        student2.addGrade(8);
        student2.addGrade(7);

        Student student3 = new Student("Jake Doe");
        student3.addGrade(7);
        student3.addGrade(4);
        student3.addGrade(6);
        student3.addGrade(5);

        CourseGradeBook courseGradeBook = new CourseGradeBook();
        courseGradeBook.addStudent(student1);
        courseGradeBook.addStudent(student2);
        courseGradeBook.addStudent(student3);

        courseGradeBook.printStudentGPA();
        courseGradeBook.printCourseGPA();
    }
}
