package com.mg.problems;

import com.mg.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurrenceOfNames {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Vasu", "Pune", 10000),
                new Employee("Abhi", "Chennai", 15000),
                new Employee("Prakash", "Delhi", 18000),
                new Employee("Mahesh", "Pune", 17500),
                new Employee("Mahesh", "Kolkata", 22500)
        );

        Map<String, Long> result = emps.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(result);
    }
}
