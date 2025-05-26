package com.mg.java21;

public class NestedRecordPattern {
    public static void main(String[] args) {
        Person2 person = new Person2("Murugesh", 30, new Address("Bangalore", "India"));
        printCity(person);
    }

    private static void printCity(Object obj) {
        if (obj instanceof Person2(String name, int age, Address(String city, String country))) {
            System.out.println(name + " lives in " + city + ", " + country);
        }
    }
}

record Address(String city, String Address) {
}

record Person2(String name, int age, Address address) {
}
