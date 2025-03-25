package com.mg.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45);

        Map<Boolean, List<Integer>> res = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> oddNums=res.get(false);
        List<Integer> evenNums=res.get(true);
        System.out.println("Odd : "+oddNums);
        System.out.println("Even : "+evenNums);

    }
}
