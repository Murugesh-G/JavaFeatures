package com.mg.java8;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println(uniqueNumbers);
    }
}
