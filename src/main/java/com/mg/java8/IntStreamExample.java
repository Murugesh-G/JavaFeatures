package com.mg.java8;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        String input = "Java8Features";

        String reversedString = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - 1 - i))
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString
                ));

        System.out.println(reversedString);
    }
}
