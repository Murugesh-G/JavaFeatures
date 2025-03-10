package com.mg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsAPIFeatures {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);

        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.removeIf(number -> number % 2 == 0);
        System.out.println(numbers);

    }
}
