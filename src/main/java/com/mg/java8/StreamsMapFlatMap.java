package com.mg.java8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsMapFlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = words.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);
    }
}
