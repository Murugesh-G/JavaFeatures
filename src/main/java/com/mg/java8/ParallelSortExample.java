package com.mg.java8;

import java.util.Arrays;

public class ParallelSortExample {
    public static void main(String[] args) {
        int[] arr= {99,55,203,99,4,91};
        Arrays.parallelSort(arr);
        Arrays.stream(arr)
                .forEach(System.out::println);

    }
}
