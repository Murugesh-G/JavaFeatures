package com.mg.java8;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        // Non nullable
        Optional<String> name1 = Optional.of("John");

        // Nullable
        Optional<String> name2 = Optional.ofNullable(null);

        // Empty Optional
        Optional<String> name3 = Optional.empty();

        Optional<String> name4 = Optional.of("John");
        name4.ifPresent(System.out::println);

        Optional<String> name5 = Optional.empty();
        System.out.println(name5.isEmpty());

        Optional<String> name6 = Optional.empty();
        String result1 = name6.orElse("Default");
        System.out.println(result1);

        Optional<String> name7 = Optional.empty();
        String resul2 = name7.orElseGet(() -> "Default from Supplier");
        System.out.println(resul2);

       /* Optional<String> name8=Optional.empty();
        name8.orElseThrow(()-> new IllegalArgumentException("Value not found"));*/

        Optional<String> name9 = Optional.of("John");
        Optional<Integer> len = name9.map(String::length);
        System.out.println(len.get());

        Optional<String> name10 = Optional.of("John");
        Optional<String> upperCase = name10.flatMap(n -> Optional.of(n.toUpperCase()));
        System.out.println(upperCase.get());

        Optional<String> name=Optional.of("John");
        Optional<String> filtered=name.filter(n->n.length()>3);
        System.out.println(filtered.get());

        Optional<String> name11=Optional.of("John");
        name11.ifPresent(System.out::println);

        //Optional<String> name12=Optional.of("John");
        Optional<String> name12=Optional.empty();
        name12.ifPresentOrElse(System.out::println, () -> System.out.println("Name is absent"));

        Optional<String> name13=Optional.of("John");
        name13.stream().forEach(System.out::println);
    }
}
