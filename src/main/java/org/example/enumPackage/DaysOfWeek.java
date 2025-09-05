package org.example.enumPackage;

public enum DaysOfWeek {
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String dayName;

    DaysOfWeek(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

    public String weekdayOrWeekend(DaysOfWeek dayOfWeek) {
        if (dayOfWeek == SATURDAY || dayOfWeek == SUNDAY) {
            return "Weekend";
        }else{
            return this.dayName;
        }
    }
}
