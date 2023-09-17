package org.session15.homework.bulkchallenges;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
public class Student {

    String name;
    int age;
    @EqualsAndHashCode.Exclude
    int studentID;
    String email;

    @Override
    public String toString() {
        return '{' +
                "\"Student\": {" +
                " \"name=\": \"" + name + "\"," +
                " \"age=\": " + age + ',' +
                " \"studentID=\": " + studentID + ',' +
                " \"email=\": \"" + email + "\"} " +
                '}';
    }
}

class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentID(1);
        s1.setAge(21);
        s1.setName("John");
        s1.setEmail("j@gmail.com");

        Student s2 = new Student();
        s2.setStudentID(2);
        s2.setAge(21);
        s2.setName("John");
        s2.setEmail("j@gmail.com");

        System.out.println("s1.equals(s2) ? " + s1.equals(s2));
        System.out.println("s1.hashcode() > " + s1.hashCode());
        System.out.println("s2.hashcode() > " + s2.hashCode());


    }
}
