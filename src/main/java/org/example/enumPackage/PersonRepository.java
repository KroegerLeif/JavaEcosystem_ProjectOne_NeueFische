package org.example.enumPackage;

import java.util.ArrayList;
import java.util.Objects;

public class PersonRepository {
    private ArrayList<Person> persons;

    public PersonRepository(){
        persons  = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    //Boiler Plate Code
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PersonRepository that)) return false;
        return Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(persons);
    }

}
