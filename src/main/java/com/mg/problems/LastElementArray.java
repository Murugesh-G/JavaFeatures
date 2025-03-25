package com.mg.problems;

import java.util.Arrays;
import java.util.OptionalInt;

public class LastElementArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        OptionalInt lastElement = Arrays.stream(numbers)
                .reduce((first, second) -> second);
        System.out.println(lastElement.orElseThrow());

    }
}
