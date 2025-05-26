package com.mg.java21.recordpatterns;

public class BasicRecordPattern {
    public static void main(String[] args) {
        Person1 person = new Person1("Murugesh", 30);
        printInfo(person);
    }

    private static void printInfo(Object obj) {
        if (obj instanceof Person1(String name, int age)) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Not a Person");
        }
    }
}

record Person1(String name, int age) {
}