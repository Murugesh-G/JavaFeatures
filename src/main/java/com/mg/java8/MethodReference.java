package com.mg.java8;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        /*// Static method reference
        // Using a lambda expression
        Function<Integer, Double> lambdaMethod=(num)-> Math.sqrt(num);
        // Using method reference
        Function<Integer, Double> methodref = Math::sqrt;
        System.out.println(methodref.apply(25));*/

        // Instance method reference
        String message = "Hello world";
        // Using a lambda expression
        Supplier<String> lambdaMethod = () -> message.toLowerCase();
        // Using method reference
        Supplier<String> methodRef = message::toLowerCase;
        System.out.println(methodRef.get());

    }
}
