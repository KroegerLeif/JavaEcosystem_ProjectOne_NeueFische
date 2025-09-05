package org.example;

import org.example.ecosystem.DaysOfWeek;
import org.example.ecosystem.Gender;
import org.example.ecosystem.Person;
import org.example.ecosystem.PersonRepository;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        Person person = new Person(12,"Paul", Gender.MALE, DaysOfWeek.FRIDAY);
        Person person2 = new Person(13,"John", Gender.MALE, DaysOfWeek.SATURDAY);
        Person person3 = new Person(14,"George", Gender.MALE, DaysOfWeek.SUNDAY);
        Person person4 = new Person(15,"Ringo", Gender.FEMALE, DaysOfWeek.MONDAY);
        Person person5 = new Person(16,"Pauline", Gender.FEMALE, DaysOfWeek.TUESDAY);
        Person person6 = new Person(17,"George", Gender.MALE, DaysOfWeek.WEDNESDAY);
        Person person7 = new Person(18,"John", Gender.MALE, DaysOfWeek.THURSDAY);
        Person person8 = new Person(19,"Ringo", Gender.FEMALE, DaysOfWeek.FRIDAY);

        personRepository.addPerson(person);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);
        personRepository.addPerson(person4);
        personRepository.addPerson(person5);
        personRepository.addPerson(person6);
        personRepository.addPerson(person7);
        personRepository.addPerson(person8);

        System.out.println("Find Person by Id:");

        printPersons(personRepository, 12);
        printPersons(personRepository, 9);
        printPersons(personRepository, 13);

        System.out.println("Find Person by Name:");

        printPesonFoundByName(personRepository, "John");
        printPesonFoundByName(personRepository, "Leif");
        printPesonFoundByName(personRepository, "Pauline");


    }

    private static void printPersons(PersonRepository personRepository, int id){
        Optional<Person> personOptioanl = personRepository.getPersonById(id);
        if(personOptioanl.isPresent()){
            System.out.println("Name: " + personOptioanl.get().name());
            System.out.println("Lieblings Tag: " + personOptioanl.get().favoriteDay());
        }else{
            System.out.println("No person found");
        }
    }

    private static void printPesonFoundByName(PersonRepository personRepository, String name){
        Optional<Person> personOptioanl = personRepository.getPersonByName(name);
        if(personOptioanl.isPresent()){
            System.out.println("Name: " + personOptioanl.get().name());
            System.out.println("Lieblings Tag: " + personOptioanl.get().favoriteDay());
        }else{
            System.out.println("No person found with that name: " + name);
        }
    }


}