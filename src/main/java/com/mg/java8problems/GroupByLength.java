package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "bb", "ccc", "dd");
        Map<Integer, List<String>> res = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(res);

    }
}
