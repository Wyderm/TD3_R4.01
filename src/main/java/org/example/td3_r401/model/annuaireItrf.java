package org.example.td3_r401.model;

import java.util.List;

public interface annuaireItrf {
    List<Person> getAllPersons();
    Person getPersonById(int id);
    Person getPersonByName(String name);
    void deletePersonById(int id);
    void addPerson(Person person);
}

//analyse