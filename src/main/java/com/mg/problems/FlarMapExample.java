package com.mg.problems;

import java.util.Arrays;
import java.util.List;

public class FlarMapExample {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
