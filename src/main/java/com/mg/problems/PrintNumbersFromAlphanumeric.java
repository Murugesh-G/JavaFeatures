package com.mg.problems;

import java.util.Arrays;

public class PrintNumbersFromAlphanumeric {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5f6g7h8i9j0";
        int[] res = str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();
        System.out.println(Arrays.toString(res));
    }
}
