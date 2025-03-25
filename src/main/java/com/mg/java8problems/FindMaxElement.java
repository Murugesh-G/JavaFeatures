package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        int maxNum = myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(maxNum);

        int arr[] = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        int maxNum2 = Arrays.stream(arr)
                .boxed()
                .max(Integer::compare)
                .get();
        System.out.println(maxNum2);

    }
}
