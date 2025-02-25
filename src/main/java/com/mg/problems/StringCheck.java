package com.mg.problems;

import java.util.Arrays;
import java.util.List;

public class StringCheck {
    public static void main(String[] args) {
        String csvString = "apple, banana, orange, mango";
        String target = "banana";
        if (isStringPresent(csvString, target)) {
            System.out.println(target + " is present in the list.");
        } else {
            System.out.println((target + " is NOT present in the list."));
        }
    }

    public static boolean isStringPresent(String csvString, String target) {
        if (csvString == null || target == null) {
            return false;
        }

        List<String> items = Arrays.stream(csvString.split(","))
                .map(String::trim)
                .toList();
        if (items.contains(target)) {
            return true;
        } else {
            return false;
        }
    }

}
