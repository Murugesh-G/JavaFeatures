package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgStringsLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        OptionalDouble avg = strings.stream()
                .mapToInt(String::length)
                .average();
        System.out.println(avg.getAsDouble());
    }
}
