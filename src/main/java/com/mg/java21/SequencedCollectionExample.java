package com.mg.java21;

import java.util.List;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.reversed());

    }
}
