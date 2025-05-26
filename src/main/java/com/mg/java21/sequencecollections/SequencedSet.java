package com.mg.java21.sequencecollections;

import java.util.LinkedHashSet;

public class SequencedSet {
    public static void main(String[] args) {
        java.util.SequencedSet<String> languages = new LinkedHashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Go");

        System.out.println("First: " + languages.getFirst());
        System.out.println("Last: " + languages.getLast());
        System.out.println("Reversed: " + languages.reversed());
    }
}
