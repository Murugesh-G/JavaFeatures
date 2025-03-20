package com.mg.problems;

import java.util.Arrays;
import java.util.List;

public class CountWordInSentence {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String word = "java";

        long count = strings.stream()
                .flatMap(str -> Arrays.stream(str.split("\\s+"))) // Split each string into words
                .filter(w -> w.equals(word)) // Filter the target word
                .count(); // Count occurrences
        System.out.println("Occurences of " + word + " : " + count);
    }
}
