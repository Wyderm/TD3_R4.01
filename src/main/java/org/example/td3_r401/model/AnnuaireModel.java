package org.example.td3_r401.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnnuaireModel implements annuaireItrf {
    private List<Person> persons = new ArrayList<>();

    public AnnuaireModel() {
        persons.add(new Person("De-Clerck", "Charlie", "555555555", "Chicago"));
        persons.add(new Person("Mathieu", "John", "123456789", "New York"));
        persons.add(new Person("Deghaye", "Jane", "987654321", "Los Angeles"));
        persons.add(new Person("Houlet", "Emily", "111111111", "Houston"));
        persons.add(new Person("Allostry", "Michael", "222222222", "Phoenix"));
        persons.add(new Person("De-Clerck", "Sarah", "333333333", "Philadelphia"));
        persons.add(new Person("Mathieu", "David", "444444444", "San Antonio"));
        persons.add(new Person("Deghaye", "Laura", "555555555", "San Diego"));
        persons.add(new Person("Houlet", "James", "666666666", "Dallas"));
        persons.add(new Person("Allostry", "Maria", "777777777", "San Jose"));
        persons.add(new Person("De-Clerck", "Robert", "888888888", "Austin"));
        persons.add(new Person("Mathieu", "Linda", "999999999", "Jacksonville"));
        persons.add(new Person("Deghaye", "William", "101010101", "Fort Worth"));
        persons.add(new Person("Houlet", "Barbara", "202020202", "Columbus"));
        persons.add(new Person("Allostry", "Richard", "303030303", "Charlotte"));
        persons.add(new Person("De-Clerck", "Susan", "404040404", "San Francisco"));
        persons.add(new Person("Mathieu", "Joseph", "505050505", "Indianapolis"));
        persons.add(new Person("Deghaye", "Jessica", "606060606", "Seattle"));
        persons.add(new Person("Houlet", "Daniel", "707070707", "Denver"));
        persons.add(new Person("Allostry", "Karen", "808080808", "Washington"));
        persons.add(new Person("De-Clerck", "Matthew", "909090909", "Boston"));
        persons.add(new Person("Mathieu", "Betty", "111111112", "El Paso"));
        persons.add(new Person("Deghaye", "Christopher", "222222223", "Detroit"));
        persons.add(new Person("Houlet", "Dorothy", "333333334", "Nashville"));
        persons.add(new Person("Allostry", "Anthony", "444444445", "Memphis"));
        persons.add(new Person("De-Clerck", "Sandra", "555555556", "Portland"));
        persons.add(new Person("Mathieu", "Mark", "666666667", "Oklahoma City"));
        persons.add(new Person("Deghaye", "Ashley", "777777778", "Las Vegas"));
        persons.add(new Person("Houlet", "Steven", "888888889", "Louisville"));
        persons.add(new Person("Allostry", "Donna", "999999990", "Baltimore"));
        persons.add(new Person("De-Clerck", "Paul", "101010102", "Milwaukee"));
        persons.add(new Person("Mathieu", "Carol", "202020203", "Albuquerque"));
        persons.add(new Person("Deghaye", "Kevin", "303030304", "Tucson"));
        persons.add(new Person("Houlet", "Nancy", "404040405", "Fresno"));
        persons.add(new Person("Allostry", "Brian", "505050506", "Sacramento"));
        persons.add(new Person("De-Clerck", "Lisa", "606060607", "Kansas City"));
        persons.add(new Person("Mathieu", "George", "707070708", "Long Beach"));
        persons.add(new Person("Deghaye", "Michelle", "808080809", "Mesa"));
        persons.add(new Person("Houlet", "Edward", "909090910", "Atlanta"));
        persons.add(new Person("Allostry", "Kimberly", "111111113", "Colorado Springs"));
        persons.add(new Person("De-Clerck", "Joshua", "222222224", "Virginia Beach"));
        persons.add(new Person("Mathieu", "Patricia", "333333335", "Raleigh"));
        persons.add(new Person("Deghaye", "Charles", "444444446", "Omaha"));
        persons.add(new Person("Houlet", "Margaret", "555555557", "Miami"));
        persons.add(new Person("Allostry", "Thomas", "666666668", "Oakland"));
        persons.add(new Person("De-Clerck", "Betty", "777777779", "Minneapolis"));
        persons.add(new Person("Mathieu", "James", "888888880", "Tulsa"));
        persons.add(new Person("Deghaye", "Dorothy", "999999991", "Arlington"));
        persons.add(new Person("Houlet", "Anthony", "101010103", "New Orleans"));
        persons.add(new Person("Allostry", "Sandra", "202020204", "Wichita"));
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


//analyse