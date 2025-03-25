package com.mg.problems;

import com.mg.pojo.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesOnNames {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Vasu", "Pune", 1990),
                new Employee("Abhi", "Bangalore", 1991),
                new Employee("Prakash", "Delhi", 1995),
                new Employee("Mahesh", "Chennai", 1989)
        );

        emps.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList()
                .forEach(System.out::println);
    }

}
