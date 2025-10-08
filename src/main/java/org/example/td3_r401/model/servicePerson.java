package org.example.td3_r401.model;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class servicePerson {
    private List<Person> persons = new ArrayList<>();

    public servicePerson() {
        persons.add(new Person("Doe", "John", "123456789", "New York"));
        persons.add(new Person("Smith", "Jane", "987654321", "Los Angeles"));
        persons.add(new Person("Brown", "Charlie", "555555555", "Chicago"));
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public Person getPersonById(int id) {
        for (Person p : persons) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Person getPersonByName(String name) {
        for (Person p : persons) {
            if (p.getNom().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void deletePersonById(int id) {
        for (Person p : persons) {
            if (p.getId() == id) {
                persons.remove(p);
                return;
            }
        }
    }

    public void addPerson(Person person) {
        persons.add(person);
    }
}
