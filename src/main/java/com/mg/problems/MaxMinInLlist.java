package com.mg.problems;

import java.util.List;
import java.util.Optional;

public class MaxMinInLlist {
    public static void main(String[] args) {
        List<Integer> list = List.of(30, 50, 10, 209, 44, 2);
        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        Optional<Integer> min = list.stream()
                .min(Integer::compareTo);
        System.out.println("Max : " + max.orElseThrow());
        System.out.println("Min : " + min.orElseThrow());
    }
}
