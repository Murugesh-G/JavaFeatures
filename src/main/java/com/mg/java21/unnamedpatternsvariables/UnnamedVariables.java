package com.mg.java21.unnamedpatternsvariables;

import java.util.List;

public class UnnamedVariables {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "bob", "Charlie");
        names.forEach(_ -> System.out.println("Hello!"));
    }
}
