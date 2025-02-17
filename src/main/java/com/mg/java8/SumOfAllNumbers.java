package com.mg.java8;

import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum " + sum);
    }
}
