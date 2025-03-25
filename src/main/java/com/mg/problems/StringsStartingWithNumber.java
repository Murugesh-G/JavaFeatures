package com.mg.problems;

import java.util.Arrays;
import java.util.List;

public class StringsStartingWithNumber {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123abc", "hello", "9start", "test", "42xyz", "java8", "8lambda");
        List<String> res = strings.stream()
                .filter(s -> s.matches("^[0-9].*"))
                .toList();
        System.out.println("Result : " + res);
    }
}
