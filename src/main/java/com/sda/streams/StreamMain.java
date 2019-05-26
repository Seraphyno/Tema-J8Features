package com.sda.streams;

import com.sda.person.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Using streams obtain the following information:
 * - Is "Radu" a member of the list?
 * - Average age
 * - Order list by age
 */
public class StreamMain {

    public static void main(String[] args) {
        List<Person> persons = Person.createPersons();

        Optional<String> radu = persons.stream()
                .map(Person::getFullName)
                .filter(name -> name.equals("Radu"))
                .findAny();
        System.out.println(radu.isPresent());


        long count = persons.stream()
                .map(Person::getAge)
                .count();
        Integer sum = persons.stream()
                .map(Person::getAge)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(sum/count);


        List<Person> sorted = persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .peek(person -> System.out.println(person.getFullName() + " " + person.getAge()))
                .collect(Collectors.toList());
    }
}
