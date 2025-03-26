package com.mg.java21;

import java.util.LinkedHashMap;
import java.util.SequencedCollection;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        map.putFirst(0, "Z");
        map.putLast(4, "D");

        System.out.println(map);

        System.out.println(map.reversed());


    }
}
