package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        long count = myList.stream()
                .count();
        System.out.println(count);

        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        long count2 = Arrays.stream(arr)
                .count();
        System.out.println(count2);

    }
}
