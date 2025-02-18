package com.mg.java8;

import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Apple", "Banana", "Cherry");
        Stream<String> stream2 = Stream.of("Date", "Fig", "Grapes");
        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
        concatenatedStream.forEach(System.out::println);
    }
}
