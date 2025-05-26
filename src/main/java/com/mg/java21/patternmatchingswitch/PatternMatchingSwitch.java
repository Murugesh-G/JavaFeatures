package com.mg.java21.patternmatchingswitch;

public class PatternMatchingSwitch {
    //Pattern Matching for switch
    static void printObjectType(Object obj) {
        switch (obj) {
            case String s -> System.out.println("String of length: " + s.length());
            case Integer i -> System.out.println("Integer: " + i);
            default -> System.out.println("Unkown type");
        }
    }

    // Exhaustiveness in switch Expressions
    static String describe(Object obj) {
        return switch (obj) {
            case String s -> "A string: " + s;
            case Integer i -> "An integer: " + i;
            case null -> "Null value";
            default -> "Something else";
        };
    }

    // Guarded Patterns (with when clause)
    static void checkStringLength(Object obj) {
        switch (obj) {
            case String s when s.length() > 5 -> System.out.println("Long string: " + s);
            case String s -> System.out.println("Short string: " + s);
            default -> System.out.println("Not a string");
        }
    }
}
