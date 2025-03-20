package com.mg.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words1 = Arrays.asList("java", "python", "c", "javascript", "go");
        words1.sort((w1, w2) -> Integer.compare(w1.length(), w2.length()));
        System.out.println(words1);

        List<String> words2 = Arrays.asList("java", "python", "c", "javascript", "go");
        words2.sort(Comparator.comparingInt(String::length));
        System.out.println(words2);

        List<String> words3 = Arrays.asList("java", "python", "c", "javascript", "go");
        List<String> words4 = words3.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList(); // Collecting to new List
        System.out.println(words4);
    }
}
