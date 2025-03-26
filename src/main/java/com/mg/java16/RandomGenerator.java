package com.mg.java16;

import java.util.random.RandomGeneratorFactory;

public class RandomGenerator {
    public static void main(String[] args) {
        java.util.random.RandomGenerator randomGenerator = RandomGeneratorFactory.of("L64X128MixRandom").create();
        randomGenerator.ints(5).forEach(System.out::println);
    }
}
