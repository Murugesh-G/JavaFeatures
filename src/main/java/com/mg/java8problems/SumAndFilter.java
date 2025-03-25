package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;

public class SumAndFilter {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(20, 50, 80),
                Arrays.asList(10, 10, 40),
                Arrays.asList(60, 90, 30)
        );

        List<Integer> filteredNumbers = numbers.stream()
                .flatMap(List::stream)
                .filter(num -> num > 70)
                .toList();

        int sum = numbers.stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();

        filteredNumbers.forEach(num -> System.out.println("num -> " + num));
        System.out.println("Sum -> " + sum);
    }
}
