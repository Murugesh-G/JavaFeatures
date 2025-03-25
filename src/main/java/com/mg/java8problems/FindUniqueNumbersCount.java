package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueNumbersCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 50, 40, 40);
        Map<Integer, Long> occurrences = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        occurrences.forEach((num, count) -> System.out.println(num + " -> " + count));
    }
}
