package com.mg.java8;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStreamExample {
    public static void main(String[] args) {
        // Arrays.stream()
        String[] fruits = {"Apple", "Banana", "Cherry"};
        Stream<String> stream1 = Arrays.stream(fruits);
        stream1.forEach(System.out::println);

        int[] intNumbers = new int[]{9, 8, 7, 6, 5};
        IntStream stream2 = Arrays.stream(intNumbers);
        stream2.forEach(System.out::println);

        // Stream.of()
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Stream<Integer> stream3 = Stream.of(numbers);
        stream3.forEach(System.out::println);
    }
}
