package com.mg.java21.sequencecollections;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));

        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());

        fruits.addFirst("Mango");
        fruits.addLast("Orange");

        System.out.println("After addFirst and addLast: " + fruits);

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("After removeFirst and removeLast: " + fruits);

        System.out.println("Reversed: " + fruits.reversed());


    }
}
