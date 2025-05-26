package com.mg.java21.unnamedpatternsvariables;

public class UnnamedPatternsRecordDeconstruction {
    public static void main(String[] args) {
        Person person = new Person("Vasu", 25, "BLR");
        greet(person);
    }

    static void greet(Person person) {
        if (person instanceof Person(String name, _, _)) {
            System.out.println("Hello, " + name);
        }
    }
}

