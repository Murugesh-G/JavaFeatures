package com.mg.problems;

import java.util.*;
import java.util.function.Function;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 45);
        Optional<Integer> max1 = numbers.stream()
                //.max(Comparator.comparing(Function.identity()));
                .max(Integer::compareTo);
        System.out.println(max1.get());

        int max2 = Collections.max(numbers);
        System.out.println(max2);


    }
}
