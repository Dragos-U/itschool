package org.session4.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    @DisplayName("This person is an adult")
    void testDisplayIfThePersonIsAdult(){
        Person person = new Person(18);
        assertEquals("I am adult.", person.adulthoodOfPerson());
    }

    @Test
    @DisplayName("This person is not an adult")
    void testPrintIfThePersonIsNotAdult(){
        Person person = new Person(17);
        assertEquals("I am not adult.", person.adulthoodOfPerson());
    }
}
