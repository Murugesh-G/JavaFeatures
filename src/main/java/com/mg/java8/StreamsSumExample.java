package com.mg.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsSumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of numbers : " + sum);
    }
}
