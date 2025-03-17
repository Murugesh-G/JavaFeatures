package com.mg.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> versions = List.of("Lollipop", "Kitkat", "Jelly Bean", "Ice Cream Sandwidth", "Honeycomb", "Gingerbread");
        versions.stream().filter(s -> s.length() > 10).forEach(System.out::println);
        String first = versions.stream().filter(s -> s.contains("e")).findFirst().get();
        System.out.println(first);

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 1, 6, 3, 12, 18);
        Integer lcm = list.stream().filter(num -> num % 2 == 0).filter(num -> num % 3 == 0).findFirst().get();
        System.out.println(lcm);

        Set<Integer> duplicateElements=new HashSet<>();
        Set<Integer> nums= list.stream()
                .filter(n->!duplicateElements.add(n))
                .collect(Collectors.toSet());
        System.out.println("------------------------------");
        System.out.println(nums);


    }
}
