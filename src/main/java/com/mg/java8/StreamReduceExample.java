package com.mg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        Optional<Integer> sum2 = numbers.stream()
                .reduce(Integer::sum);
        System.out.println(sum2);

        Optional<Integer> maxValue = numbers.stream()
                .reduce(Integer::max);
        System.out.println(maxValue.get());
    }

}
