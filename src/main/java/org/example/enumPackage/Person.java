package org.example.enumPackage;

public record Person(
        int id,
        String name,
        Gender gender,
        DaysOfWeek favoriteDay) {}
