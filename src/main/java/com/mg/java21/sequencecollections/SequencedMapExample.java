package com.mg.java21.sequencecollections;

import java.util.LinkedHashMap;
import java.util.SequencedCollection;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.putFirst(0, "Zero");

        System.out.println("Map: " + map);
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        SequencedMap<Integer, String> reversed = map.reversed();
        System.out.println("Reversed Map: " + reversed);


    }
}
