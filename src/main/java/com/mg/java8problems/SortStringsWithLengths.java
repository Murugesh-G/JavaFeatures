package com.mg.java8problems;

import java.util.Comparator;
import java.util.List;

public class SortStringsWithLengths {
    public static void main(String[] args) {
        List<String> strs=List.of("Apple", "Banana","Grapes","Orange","Mango","MuskMelon");
        strs.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        strs.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
