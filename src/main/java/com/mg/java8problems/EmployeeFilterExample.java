package com.mg.java8problems;

import com.mg.pojo.EmployeeFilter;

import java.util.Arrays;
import java.util.List;

public class EmployeeFilterExample {
    public static void main(String[] args) {
        List<EmployeeFilter> employees = Arrays.asList(
                new EmployeeFilter("John", "Male", 35, 38000),
                new EmployeeFilter("David", "Male", 28, 45000),
                new EmployeeFilter("Mike", "Male", 32, 39000),
                new EmployeeFilter("Emma", "Female", 31, 35000),
                new EmployeeFilter("Sophia", "Female", 40, 50000),
                new EmployeeFilter("Tom", "Male", 45, 25000)
        );

        List<EmployeeFilter> filteredEmployess = employees.stream()
                .filter(emp -> "Male".equalsIgnoreCase(emp.getGender()))
                .filter(emp -> emp.getAge() > 30)
                .filter(emp -> emp.getSalary() < 40000)
                .toList();

        filteredEmployess.forEach(System.out::println);
    }
}
