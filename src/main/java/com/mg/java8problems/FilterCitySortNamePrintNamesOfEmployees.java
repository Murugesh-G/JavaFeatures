package com.mg.java8problems;

import com.mg.pojo.Employee;

import java.util.Comparator;
import java.util.List;

public class FilterCitySortNamePrintNamesOfEmployees {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Vasu", "Pune", 1990),
                new Employee("Abhi", "Bangalore", 1991),
                new Employee("Prakash", "Pune", 1995),
                new Employee("Mahesh", "Chennai", 1989)
        );

        emps.stream()
                .filter(emp -> emp.getAddress().equals("Pune"))
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
