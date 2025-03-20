package com.mg.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMappingExample {
    public static void main(String[] args) {
        List<EmployeeMapping> list = List.of(
                new EmployeeMapping("Vasu", "IT"),
                new EmployeeMapping("Ramya", "HR"),
                new EmployeeMapping("John", "Sales"),
                new EmployeeMapping("Mahesh", "HR")
        );

        Map<String, List<String>> departmentEmployees = list.stream()
                .collect(Collectors.groupingBy(EmployeeMapping::department, Collectors.mapping(EmployeeMapping::department, Collectors.toList())));
        System.out.println(departmentEmployees);
    }
}

record EmployeeMapping(String name, String department) {
}
