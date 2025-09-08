package org.example.lombokTraining;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> student;
}
