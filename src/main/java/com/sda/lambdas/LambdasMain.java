package com.sda.lambdas;

import com.sda.person.Person;

import java.util.List;

import static com.sda.person.Person.createPersons;

/**
 * Create a predicate to test if the person is an adult
 * use the 2 ways and compare them
 * @see AdultPersonTest
 *
 *
 * Create a function that make a person older by an year
 * @see PersonFunction
 */
public class LambdasMain {

    public static void main(String[] args) {
        List<Person> persons = createPersons();


    }
}
