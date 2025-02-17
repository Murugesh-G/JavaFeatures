package com.mg.java8;

import java.util.List;
import java.util.OptionalDouble;

public class SumofNumsFilterAvg {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 10, 12, 8, 7, 15);

        OptionalDouble average = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n >= 100)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Average of remaining numbers: " + (average.isPresent() ? average.getAsDouble() : "No numbers left after filtering"));
    }
}
