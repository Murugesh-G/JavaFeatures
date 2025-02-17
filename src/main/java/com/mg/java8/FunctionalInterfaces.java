package com.mg.java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<String> stringConsumer= System.out::println;
        stringConsumer.accept("Murugesh-Consumer");

        Supplier<String> stringSupplier=()-> "Murugesh-Supplier";
        System.out.println(stringSupplier.get());
    }
}
