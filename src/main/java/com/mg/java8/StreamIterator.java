package com.mg.java8;

import java.util.stream.Stream;

public class StreamIterator {
    public static void main(String[] args) {
        Stream.iterate(1, count -> count + 1)
                .filter(number -> number % 2 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
