package com.maemresen.jw.spring.boot.service.repository.impl;

import com.maemresen.jw.spring.boot.service.domain.Person;
import com.maemresen.jw.spring.boot.service.repository.PersonRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private static final List<Person> PERSON_DATABASE = List.of(
            new Person("Emre", 18),
            new Person("Mehmet", 35),
            new Person("Arif", 10)
    );

    @Override
    public Optional<Person> findByName(String name) {
        return PERSON_DATABASE.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
