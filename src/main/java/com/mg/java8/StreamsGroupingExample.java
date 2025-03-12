package com.mg.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsGroupingExample {
    public static void main(String[] args) {
        List<EmployeeGroup> employees = List.of(
                new EmployeeGroup("Alice", "IT", 10000, "Senior"),
                new EmployeeGroup("Bob", "HR", 15000, "Junior"),
                new EmployeeGroup("Charlie", "IT", 20000, "Junior")
        );

        Map<String, List<EmployeeGroup>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment));
        System.out.println(groupedByDepartment);

        Map<String, List<EmployeeGroup>> result1 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment));
        System.out.println(result1);

        Map<Boolean, List<EmployeeGroup>> result2 = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getDepartment().equals("IT")));
        System.out.println(result2);

        Map<String, Long> result3 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.counting()));
        System.out.println(result3);

        Map<String, List<String>> result4 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.mapping(EmployeeGroup::getName, Collectors.toList())));
        System.out.println(result4);

        Map<String, Optional<EmployeeGroup>> result5 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.maxBy(Comparator.comparing(EmployeeGroup::getSalary))));
        System.out.println(result5);

        Map<String, Double> result6 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.summingDouble(EmployeeGroup::getSalary)));
        System.out.println(result6);

        Map<String, Double> result7 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.averagingDouble(EmployeeGroup::getSalary)));
        System.out.println(result7);

        Map<String, String> result8 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.mapping(EmployeeGroup::getName, Collectors.joining(", "))));
        System.out.println(result8);

        Map<String, Map<String, List<EmployeeGroup>>> result9 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment, Collectors.groupingBy(EmployeeGroup::getExperienceLevel)));
        System.out.println(result9);

        Map<String, List<EmployeeGroup>> result10 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(EmployeeGroup::getSalary).reversed())
                                        .limit(2)
                                        .toList()
                        )
                ));
        System.out.println(result10);
    }
}

@AllArgsConstructor
@Getter
@ToString
class EmployeeGroup {
    String name;
    String department;
    int salary;
    String experienceLevel;
}

