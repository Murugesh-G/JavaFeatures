package com.mg.problems;

import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = str1.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(str2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println("Anagram : " + result);

    }
}
