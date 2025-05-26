package com.mg.java11;

import java.util.Arrays;
import java.util.List;

public class UtilCollection {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        String[] arr = names.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }
}
