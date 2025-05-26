package com.mg.java21.scopedvalue;

import java.util.NoSuchElementException;

public class ScopedValueExample {
    private static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER, "Murugesh").run(() -> {
            printUser();
            doSomething();
        });
        try {
            printUser();
        } catch (NoSuchElementException e) {
            System.out.println("USER is not bound here.");
        }
    }

    static void printUser() {
        System.out.println("User: " + USER.get());
    }

    static void doSomething() {
        printUser();
    }

}
