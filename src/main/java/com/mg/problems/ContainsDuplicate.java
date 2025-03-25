package com.mg.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        Set<Integer> seen = new HashSet<>();
        boolean result = Arrays.stream(nums)
                .anyMatch(num -> !seen.add(num));
        System.out.println("Result : " + result);
    }
}
