package com.mg.java8problems;

import java.util.stream.IntStream;

public class First10EvenNumbers {
    public static void main(String[] args) {
        int count = 10;
        IntStream.iterate(2, n -> n + 2)
                .limit(count)
                .forEach(System.out::println);
    }
}
