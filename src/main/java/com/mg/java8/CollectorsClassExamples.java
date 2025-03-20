package com.mg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClassExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> collectedNames = names.stream()
                .collect(Collectors.toList());

        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());

        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));

/*        List<EmployeeGroupingBy> employees = Arrays.asList(
                new EmployeeGroupingBy("Vasu", "IT"),
                new EmployeeGroupingBy("Mahesh", "Sales"),
                new EmployeeGroupingBy("Ramu", "HR"),
                new EmployeeGroupingBy("Prakash", "IT")
        );      */
    }
}

record EmployeeGroupingBy(String name, String department) {
}
