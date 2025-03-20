package com.mg.problems;

import java.util.HashSet;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        Character firstRepeatedCharacter = input.chars()
                .mapToObj(c -> (char) c)
                .filter(new HashSet<>()::add)
                .findFirst()
                .orElse(null);
        System.out.println("First repeated character: "+firstRepeatedCharacter);
    }
}
