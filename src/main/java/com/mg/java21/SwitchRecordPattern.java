package com.mg.java21;

public class SwitchRecordPattern {

    public static void main(String[] args) {
        Person2 person = new Person2("Murugesh", 30, new Address("Bangalore", "India"));
        describe(person);
    }

    static void describe(Object obj) {
        switch (obj) {
            case Person2(String name, int age, Address(String city, String country)) ->
                    System.out.println(name + " is " + age + " years old and lives in " + city + ", " + country);
            default -> System.out.println("Unknown object");
        }
    }
}
