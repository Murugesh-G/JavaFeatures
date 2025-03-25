package com.mg.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBasedStringLength3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Go", "Python", "C", "Ruby");
        Map<Boolean, List<String>> res = strings.stream()
                .collect(Collectors.partitioningBy(str -> str.length() > 3));
        System.out.println(res);
    }
}
