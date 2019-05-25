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

        Optional<Person> invalidPersonById = getPersonById("ADD", persons);
        Optional<Person> validPersonById = getPersonById("Vlad", persons);

        logMessage(invalidPersonById);
        logMessage(validPersonById);
    }

    private static void logMessage(Optional<Person> personOptional) {
        if (personOptional.isPresent()) {
            System.out.println("Found person: " + personOptional.get().getFullName());
        } else {
            System.out.println("Didn't find the searched person");
        }
    }

    //method goes here
    private static Optional<Person> getPersonById(String name, List<Person> people) {
        return people.stream()
                .filter(person -> person.getFullName().equals(name))
                .findFirst();
    }
}
