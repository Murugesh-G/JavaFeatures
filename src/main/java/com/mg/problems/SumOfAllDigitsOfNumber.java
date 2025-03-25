package com.mg.problems;

public class SumOfAllDigitsOfNumber {
    public static void main(String[] args) {
        int number = 12345;
        int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Sum : " + sum);
    }
}
