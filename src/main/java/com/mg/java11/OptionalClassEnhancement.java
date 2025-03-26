package com.mg.java11;

import java.util.List;
import java.util.Optional;

public class OptionalClassEnhancement {
    public static void main(String[] args) {
        // isEmpty()
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nonEmptyOptional = Optional.of("Java 11");
        System.out.println(emptyOptional.isEmpty());
        System.out.println(nonEmptyOptional.isEmpty());

        //orElseThrow (without arguments)
        //String value = emptyOptional.orElseThrow();

        //ifPresentOrElse
        Optional<String> presentoptional = Optional.of("Java 11");
        presentoptional.ifPresentOrElse(val -> System.out.println("Value : " + val), () -> System.out.println("No value found!"));
        emptyOptional.ifPresentOrElse(val -> System.out.println("Value : " + val), () -> System.out.println("No value found!"));

        //stream()
        // Convert Optional values to a Stream, filter non-empty, and collect
        List<Optional<String>> optionalList = List.of(
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("11"),
                Optional.of("Features")
        );
        List<String> result = optionalList.stream()
                .flatMap(Optional::stream)
                .toList();
    }
}
