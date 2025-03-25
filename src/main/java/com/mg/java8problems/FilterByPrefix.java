package com.mg.java8problems;

import java.util.Arrays;
import java.util.List;

public class FilterByPrefix {
    public static void main(String[] args) {
        String[] words = {"java", "javascript", "python", "javabean", "csharp"};
        String prefix = "java";
        String[] filterWords = Arrays.stream(words)
                .filter(word -> word.startsWith(prefix))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(filterWords));

        List<String> filterWords2 = Arrays.stream(words)
                .filter(word -> word.startsWith(prefix))
                .toList();
        System.out.println(filterWords2);
    }
}
