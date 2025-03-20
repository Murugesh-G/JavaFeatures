package com.mg.problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 1};
        int[] uniqueArray = Arrays.stream(array)// Convert to IntStream
                .distinct()// Remove duplicates
                .toArray();// Convert back to int array
        for (int num : uniqueArray)
            System.out.println(num);

        Set<Integer> uniqueArray2 = Arrays.stream(array)// Convert to IntStream
                .boxed()// Convert int to Integer (needed for Set)
                .collect(Collectors.toSet());// Store unique values in a Set
        System.out.println(uniqueArray2);

        Set<Integer> uniqueArray3 = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));// Maintains insertion order
        System.out.println(uniqueArray3);



    }
}
