package org.session9oop.homework.collegemanagementsystem;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        Professor mathAndCsProf = new Professor();
        mathAndCsProf.setFirstName("John");
        mathAndCsProf.setLastName("Lennon");

        Professor scienceAndPhysicsProf = new Professor();
        scienceAndPhysicsProf.setFirstName("Tina");
        scienceAndPhysicsProf.setLastName("Turner");

        Professor chemistryAndBiologyProf = new Professor();
        chemistryAndBiologyProf.setFirstName("Alice");
        chemistryAndBiologyProf.setLastName("Cooper");

        Professor geographyEnglishHistoryProf = new Professor();
        geographyEnglishHistoryProf.setFirstName("Mick");
        geographyEnglishHistoryProf.setLastName("Jagger");

        Course mathematics = new Course("Mathematics 101", mathAndCsProf, "Monday: 2 PM", 120);
        Course computerScience = new Course("CS 101", mathAndCsProf, "Tuesday: 10 AM", 120);
        Course science = new Course("Science", scienceAndPhysicsProf, "Friday: 8 AM", 180);
        Course physics = new Course("Physics 101", scienceAndPhysicsProf, "Thursday: 8 PM", 60);
        Course chemistry = new Course("Chem 101", chemistryAndBiologyProf, "Monday: 10 AM", 120);
        Course biology = new Course("Biology", chemistryAndBiologyProf, "Wednesday: 10 AM", 120);
        Course geography = new Course("Geography", geographyEnglishHistoryProf, "Tuesday: 14 PM", 120);
        Course english = new Course("English", geographyEnglishHistoryProf, "Thursday: 10 AM", 120);
        Course history = new Course("history", geographyEnglishHistoryProf, "Friday: 2P M", 120);

        mathAndCsProf.addCourse(mathematics);
        mathAndCsProf.addCourse(computerScience);
        scienceAndPhysicsProf.addCourse(science);
        scienceAndPhysicsProf.addCourse(physics);
        chemistryAndBiologyProf.addCourse(chemistry);
        chemistryAndBiologyProf.addCourse(biology);
        geographyEnglishHistoryProf.addCourse(geography);
        geographyEnglishHistoryProf.addCourse(english);
        geographyEnglishHistoryProf.addCourse(history);

        Student student1 = new Student();
        student1.setFirstName("Al");
        student1.setLastName("Bundy");
        student1.addCourse(mathematics);
        student1.addCourse(computerScience);
        student1.addCourse(geography);

        Student student2 = new Student();
        student2.setFirstName("Homer");
        student2.setLastName("Simpson");
        student2.addCourse(science);
        student2.addCourse(computerScience);
        student2.addCourse(history);

        Student student3 = new Student();
        student3.setFirstName("Wade");
        student3.setLastName("Wilson");
        student3.addCourse(physics);
        student3.addCourse(english);
        student3.addCourse(chemistry);
        student3.addCourse(biology);

        student1.printCourses();
        student2.printCourses();
        student3.printCourses();

        geographyEnglishHistoryProf.printCourses();

        System.out.println("\n\n"+geography);
    }
}
