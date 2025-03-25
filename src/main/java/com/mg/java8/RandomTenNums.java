package com.mg.java8;

import java.util.Random;

public class RandomTenNums {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.ints().limit(10).forEach(System.out::println);
    }
}
