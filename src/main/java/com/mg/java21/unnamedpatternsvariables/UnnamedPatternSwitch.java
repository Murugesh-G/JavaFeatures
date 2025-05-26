package com.mg.java21.unnamedpatternsvariables;

public class UnnamedPatternSwitch {
    public static void main(String[] args) {
        Person person = new Person("Vasu", 25, "BLR");
        System.out.println(describe(person));
    }

    static String describe(Person person) {
        return switch (person) {
            case Person(String name, _, _) -> "Person named: " + name;
        };
    }
}
