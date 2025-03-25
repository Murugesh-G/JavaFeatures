package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEvenNonEvenIntegers {
    public static void main(String[] args) {
        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        Map<Boolean, List<Integer>> filteredArray = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(filteredArray);

        List<Integer> list = List.of(10, 15, 8, 49, 25, 98, 32);
        Map<Boolean, List<Integer>> filteresArray2 = list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(filteresArray2);

    }

}
