package com.mg.java8;

import com.mg.pojo.EmployeeCollectMethodPOJO;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectMethodExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> collectedNames = names.stream()
                .collect(Collectors.toList());
        System.out.println(collectedNames);

        List<String> items = Arrays.asList("Apple", "Banana", "Apple", "Orange");
        Set<String> collectedSetNames = items.stream()
                .collect(Collectors.toSet());
        System.out.println(collectedSetNames);

        List<EmployeeCollectMethodPOJO> employess = Arrays.asList(
                new EmployeeCollectMethodPOJO(1, "Alice"),
                new EmployeeCollectMethodPOJO(2, "Bob"),
                new EmployeeCollectMethodPOJO(3, "Charlie")
        );
        Map<Integer, String> employeeMap = employess.stream()
                .collect(Collectors.toMap(EmployeeCollectMethodPOJO::getId, EmployeeCollectMethodPOJO::getName));
        System.out.println(employeeMap);

        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
        String result = names2.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);

        List<String> items2 = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");
        Map<String, Long> itemCount = items2.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        System.out.println(itemCount);

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);

        System.out.println("*************************");

        List<String> names3 = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Collector<String, StringBuilder, String> customCollector = Collector.of(
                StringBuilder::new,// Supplier
                (sb, str) -> sb.append(str).append(" "),// Accumulator
                StringBuilder::append,// Combiner
                StringBuilder::toString// Finisher
        );
        String result2 = names.stream()
                .collect(customCollector);
        System.out.println(result2);
    }
}
