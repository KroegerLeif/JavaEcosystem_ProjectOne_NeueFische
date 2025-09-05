package org.example.enumPackage;

public enum Gender {
    MALE("Männlich"),
    FEMALE("Weiblich"),
    OTHER("Divers");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}
