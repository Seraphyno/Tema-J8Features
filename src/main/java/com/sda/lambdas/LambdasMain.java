package com.sda.lambdas;

import com.sda.person.Person;

import java.util.List;
import java.util.function.Predicate;

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
        AdultPersonTest personTest = new AdultPersonTest();
        Predicate<Integer> pTest = age -> age >= 18;

        for (Person temp : persons) {
            boolean classic = personTest.test(temp);
            boolean predicate = pTest.test(temp.getAge());
            System.out.println("Classic: " + classic);
            System.out.println("Predicate: " + predicate);
        }

    }
}
