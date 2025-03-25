package com.mg.problems;

import com.mg.pojo.Employee;

import java.util.Comparator;
import java.util.List;

public class FilterAndDoubleSortOnPOJO {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Vasu", "Pune", 10000),
                new Employee("Abhi", "Chennai", 15000),
                new Employee("Prakash", "Delhi", 18000),
                new Employee("Mahesh", "Pune", 17500),
                new Employee("Mahesh", "Kolkata", 22500)
        );

        List<Employee> empsList = emps.stream()
                .filter(emp -> emp.getAddress().equals("Pune"))
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getYob))
                .toList();
        System.out.println(empsList);
    }
}
