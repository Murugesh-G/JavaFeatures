package com.mg.java8;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStreamExample {
    public static void main(String[] args) {
        Stream.iterate(5, n -> n + 5)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt(100))
                .limit(5)
                .forEach(System.out::println);
    }
}
