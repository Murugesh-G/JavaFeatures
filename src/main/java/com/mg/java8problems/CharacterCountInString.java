package com.mg.java8problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountInString {
    public static void main(String[] args) {
        String input = "java8stream";
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);

        Map<Character, Integer> charcountMap2 = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));
        System.out.println(charcountMap2);
    }
}
