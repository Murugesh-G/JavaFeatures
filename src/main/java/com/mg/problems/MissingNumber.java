package com.mg.problems;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(numbers).sum();
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number : " + missingNumber);

    }
}
