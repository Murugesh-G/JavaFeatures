package com.mg.java8problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedIntArrays {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 11, 10, 86, 45}, arr2 = {67, 32, 45, 65, 12, 1, 18};
        int[] sortedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(sortedArray));

    }
}
