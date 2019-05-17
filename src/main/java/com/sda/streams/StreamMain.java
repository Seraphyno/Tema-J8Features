package com.sda.streams;

import com.sda.person.Person;

import java.util.List;

/**
 * Using streams obtain the following information:
 * - Is "Radu" a member of the list?
 * - Average age
 * - Order list by age
 */
public class StreamMain {

    public static void main(String[] args) {
        List<Person> persons = Person.createPersons();
    }
}
