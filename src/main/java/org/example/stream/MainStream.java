package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20);
        numbers.add(33);
        numbers.add(45);
        numbers.add(54);
        numbers.add(62);
        numbers.add(74);
        numbers.add(834);
        numbers.add(92);


        //Returns only even numbers
        System.out.println("Even numbers: ");
        numbers.stream()
                .filter(z -> z % 2 == 0)
                .forEach(System.out::println);

        //Multiplies every number by 2
        System.out.println("Multiplied by 2: ");
        numbers.stream()
                .map(z -> z * 2)
                .forEach(System.out::println);

        //Sorts the numbers
        System.out.println("Sorted: ");
        List<Integer> sortethenumbers = numbers.stream()
                .sorted()
                .toList();
        sortethenumbers.forEach(System.out::println);

        //Sum of all Numbers
        System.out.println("Calculate sum:");
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        //New List with all numbers
        System.out.println("New List with all numbers: ");
        List<Integer> newList = numbers.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        newList.forEach(System.out::println);
    }
}
