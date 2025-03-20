package com.mg.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIterationExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        map.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().contains("key3"))
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
