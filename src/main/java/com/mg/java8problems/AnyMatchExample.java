package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        boolean res = numbers.stream()
                .anyMatch(num -> num % 2 == 0);
        System.out.println(res);
    }
}
