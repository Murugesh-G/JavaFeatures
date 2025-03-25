package com.mg.java8problems;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 2, 8, 5, 5, 3, 2, 3, 8, 8, 8, 8};

        Optional<Integer> mostRepeatedNum = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        System.out.println("Most repeated num : " + mostRepeatedNum.orElseThrow());

    }
}
