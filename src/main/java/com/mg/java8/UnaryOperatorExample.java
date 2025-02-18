package com.mg.java8;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /*// Using UnaryOperator with Lambda
        UnaryOperator<Integer> square= x-> x * x;
        System.out.println(square.apply(5));
        System.out.println(square.apply(10));*/

        /*// Using UnaryOperator.identity()
        UnaryOperator<String> identityFunction=UnaryOperator.identity();
        System.out.println(identityFunction.apply("Hello"));*/

        //Using UnaryOperator with Streams
        List<String> names=List.of("Alice","Bob","Charlie");
        UnaryOperator<String> toUpperCase=String::toUpperCase;
        names.stream()
                .map(toUpperCase)
                .forEach(System.out::println);
    }
}
