package org.example.lombokTraining;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;
}
