package com.mg.java8problems;

import com.mg.pojo.EmployeeMax2Salary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxTwoSalaries {
    public static void main(String[] args) {
        List<EmployeeMax2Salary> employees = Arrays.asList(
                new EmployeeMax2Salary("John", 50000),
                new EmployeeMax2Salary("Alice", 80000),
                new EmployeeMax2Salary("Bob", 70000),
                new EmployeeMax2Salary("Charlie", 100000),
                new EmployeeMax2Salary("David", 120000)
        );

        employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeMax2Salary::getSalary).reversed())
                .limit(2)
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        List<EmployeeMax2Salary> employeeMax2Salaries = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeMax2Salary::getSalary).reversed())
                .limit(2)
                .toList();
        System.out.println(employeeMax2Salaries);
        System.out.println("------------------------------------------------------");
        Optional<EmployeeMax2Salary> employeeMax2Salary2 = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeMax2Salary::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(employeeMax2Salary2.get());

    }
}
