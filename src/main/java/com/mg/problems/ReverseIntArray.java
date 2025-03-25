package com.mg.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] res = IntStream.range(0, numbers.length)
                .map(i -> numbers[numbers.length - 1 - i])
                .toArray();
        System.out.println(Arrays.toString(res));
    }
}
