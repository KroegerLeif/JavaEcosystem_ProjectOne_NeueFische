package org.example.ecosystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

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
        int[] countByGender = new int[3];
        //Counts how many people are male, female and other
        for (Person person : persons) {
            switch(person.gender()){
                case MALE:
                    countByGender[0]++;
                    break;
                case FEMALE:
                    countByGender[1]++;
                    break;
                case OTHER:
                    countByGender[2]++;
                    break;
                default:
                    //Should never happen
                    System.err.println("Error: Invalid gender");
                    return null;
            }
        }
        return countByGender;
    }

    public ArrayList<Person> getPersonsByFavoriteDayOfWeek(DaysOfWeek dayOfWeek){
        ArrayList<Person> personWithSameFavoriteDay = new ArrayList<>();
        for (Person person : persons) {
            if(person.favoriteDay().equals(dayOfWeek)){
                personWithSameFavoriteDay.add(person);
            }
        }
        return personWithSameFavoriteDay;
    }

    public Optional<Person> getPersonById(int id){
        for (Person person : persons) {
            if(person.id() == id){
                return Optional.of(person);
            }
        }
        return Optional.empty();
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
