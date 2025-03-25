package com.mg.java8problems;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result1 = str1.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(str2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println("Anagram2 : " + result1);

        boolean result2 = Arrays.stream(str1.split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Arrays.stream(str2.split(""))
                                .sorted()
                                .collect(Collectors.joining())
                );
        System.out.println("Anagram2 : " + result2);

    }
}
