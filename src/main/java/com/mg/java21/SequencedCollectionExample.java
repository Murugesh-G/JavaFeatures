package com.mg.java21;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> list = new ArrayList<>();
        list.addFirst("B");
        list.addLast("C");
        list.addFirst("A");

        System.out.println("List: " + list);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        System.out.println("Reversed: " + reversed);

    }
}
