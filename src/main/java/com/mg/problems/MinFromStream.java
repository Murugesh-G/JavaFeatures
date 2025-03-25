package com.mg.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MinFromStream {
    public static void main(String[] args) {
        int res = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(res);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int res2 = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println(res2);
    }
}
