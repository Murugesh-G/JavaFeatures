package com.mg.problems;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartsWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream()
                .map(num -> num + "")
                .filter(num -> num.startsWith("1"))
                .forEach(System.out::println);

        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        List<String> resNums = Arrays.stream(arr)
                .boxed()
                .map(num -> num + "")
                .filter(num -> num.startsWith("1"))
                .toList();
        System.out.println(resNums);
    }
}
