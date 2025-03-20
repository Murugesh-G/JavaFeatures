package com.mg.java8;

import java.util.HashMap;
import java.util.Map;

public class MapComputeExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Effective Java", "Kathy Sierra");
        map.put("Spring in Action", "Craig Walls");
        map.put("Hibernate in Action", "Gavin King");
        map.put("Pro Angular", "Freeman");
        map.put("Pro Spring Boot", "Felipe Gutierrez");

        map.computeIfPresent("Effective Java", (key, value) -> "Joshua Bloch");

        map.computeIfAbsent("Core Java", (value) -> "Kathy Sierra");

        map.entrySet()
                .iterator()
                .forEachRemaining(System.out::println);
    }
}
