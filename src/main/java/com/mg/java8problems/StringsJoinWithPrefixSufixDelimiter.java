package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsJoinWithPrefixSufixDelimiter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        String result = names.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);
    }
}
