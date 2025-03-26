package com.mg.java11;

import java.util.List;

public class StringAPI {
    public static void main(String[] args) {
        String text = "   Hello Java 11!   ";
        System.out.println(text.isBlank());
        System.out.println(text.strip());
        System.out.println(text.stripTrailing());
        System.out.println(text.stripLeading());
        System.out.println("Java\n11\nFeatures".lines().count());
        System.out.println("Hello".repeat(3));
    }
}
