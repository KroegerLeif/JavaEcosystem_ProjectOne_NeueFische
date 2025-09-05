package org.example.stream;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainFileReader {
    public static void main(String[] args) throws IOException {

        //Creates A Path
        Path path = Path.of("src/main/resources/Studenten.csv");
        //Saves the content of the file in a Stream
        List<String> tableStudentsFile = Files.lines(path).toList();
        //Prints the content of the Stream
        tableStudentsFile.forEach(System.out::println);
        System.out.println("-------------------------------");

        List test = tableStudentsFile.stream()
                .flatMap(line -> Stream.of(line.split(",")))
                .toList();

        int t = 0;
        ArrayList students = new ArrayList();
        for (Object o : test) {
            if(t == 4){
                System.out.println("New Student has been added: ");
                System.out.println("Name: " + students.get(0));
                t = 0;
            }else{
                students.add(o);
                t++;
                System.out.println("Value added");
            }
        }

    }
}
