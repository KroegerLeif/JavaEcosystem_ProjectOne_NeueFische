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

    public int[] countPersonProGender(){
        int[] result = new int[3];
        //Counts how many people are male, female and other
        for (Person person : persons) {
            switch(person.gender()){
                case MALE:
                    result[0]++;
                    break;
                case FEMALE:
                    result[1]++;
                    break;
                case OTHER:
                    result[2]++;
                    break;
                default:
                    //Should never happen
                    System.err.println("Error: Invalid gender");
                    return null;
            }
        }
        return result;
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
