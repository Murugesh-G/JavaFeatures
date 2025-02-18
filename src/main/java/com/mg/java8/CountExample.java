package com.mg.java8;

import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<String> names = List.of("Saket", "Saurav", "Softwaretestinghelp", "Steve");
        long count = names.stream()
                .filter(name -> name.length() > 5)
                .count();
        System.out.println("Count : " + count);
    }
}
