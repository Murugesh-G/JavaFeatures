package com.mg.problems;

import java.util.stream.IntStream;

public class First10OddNumbers {
    public static void main(String[] args) {
        IntStream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
