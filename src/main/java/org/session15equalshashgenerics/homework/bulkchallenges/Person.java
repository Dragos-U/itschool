package org.session15equalshashgenerics.homework.bulkchallenges;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode(exclude = {"email"})
@Getter
@ToString
public class Person {

    String name;
    int age;
    String email;
}

class TestPerson {

    public static void main(String[] args) {
        Person alice1 = new Person("Alice", 23, null);
        Person alice2 = new Person("Alice", 23, null);
        Person ben = new Person("Ben", 32, "ben@gmail.com");

        System.out.println("alice 1 hashcode > " + alice1.hashCode());
        System.out.println("alice 2 hashcode > " + alice2.hashCode());
        System.out.println("ben hashcode > " + ben.hashCode());

        System.out.println("Same object in the heap ? " + (alice1 == alice2));
        System.out.println("Equivalent objects ? " + (alice1.equals(alice2)));
    }
}

