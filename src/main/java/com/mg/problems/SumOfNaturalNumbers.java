package com.mg.problems;

import java.util.stream.IntStream;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum= IntStream.rangeClosed(1,10).sum();
        System.out.println("Sum : "+sum);
    }
}
