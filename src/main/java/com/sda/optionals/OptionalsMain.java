package com.sda.optionals;

import com.sda.person.Person;

import java.util.List;
import java.util.Optional;

/**
 * Assume that the persons variable holds data received from the database
 *
 * Create a method that searches for a person, by using its name (input in the method)
 * - treat the case where the person is not found by using Optionals
 * - inside main call the method twice (with a missing person and an existing one)
 * - for both cases display a relevant message
 * @see Optional#isPresent()
 * @see Optional#get()
 * @see Optional#ofNullable(Object)
 */
public class OptionalsMain {

    public static void main(String[] args) {
        List<Person> persons = Person.createPersons();
    }

    //method goes here
}
