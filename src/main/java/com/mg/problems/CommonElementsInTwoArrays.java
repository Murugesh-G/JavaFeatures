package com.mg.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6};
        Integer[] array2 = {4, 5, 6, 7, 8, 9};

        Set<Integer> set1 = Arrays.stream(array1)
                .collect(Collectors.toSet());

        List<Integer> duplicates = Arrays.stream(array2)
                .filter(set1::contains)
                .toList();
        System.out.println(duplicates);
    }
}
