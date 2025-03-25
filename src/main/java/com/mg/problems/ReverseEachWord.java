package com.mg.problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hello World Java Streams";

        String reversedString = Arrays.stream(input.split("\\s+"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed String : " + reversedString);
    }
}
