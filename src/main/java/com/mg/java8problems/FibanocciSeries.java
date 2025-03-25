package com.mg.java8problems;

import java.util.stream.Stream;

public class FibanocciSeries {
    public static void main(String[] args) {
        int n = 10;

        Stream.iterate(new Long[]{0L, 1L}, fib -> new Long[]{fib[1], fib[0] + fib[1]})
                .limit(n)
                .map(fib -> fib[0])
                .forEach(num -> System.out.print(num + " "));

    }
}
