package com.mg.java21.sequencecollections;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        map.putFirst(0, "Zero");
        map.putLast(4, "Four");

        System.out.println("Map after putFirst and putLast: " + map);

        /* map.removeFirstEntry();
        map.removeLastEntry(); */

        System.out.println("Map after removeFirstEntry and removeLastEntry");
        System.out.println("Reversed map: " + map.reversed());

    }
}
