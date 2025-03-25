package com.mg.problems;

public class GetDateAndTime {
    public static void main(String[] args) {
        System.out.println("Current Local Date:" + java.time.LocalDate.now());
        System.out.println("Current Local Time:" + java.time.LocalTime.now());
        System.out.println("Current local Date and Time" + java.time.LocalDateTime.now());
    }
}
