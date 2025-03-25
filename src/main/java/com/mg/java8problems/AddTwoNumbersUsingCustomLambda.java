package com.mg.java8problems;

public class AddTwoNumbersUsingCustomLambda {
    public static void main(String[] args) {
        AddTwoNumbers sum = (a, b) -> a + b;
        System.out.println(sum.add(5, 3));
    }
}
