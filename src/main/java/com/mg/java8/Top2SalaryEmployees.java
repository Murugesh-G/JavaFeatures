package com.mg.java8;

import com.mg.pojo.EmployeeSalaryPOJO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Top2SalaryEmployees {
    public static void main(String[] args) {
        List<EmployeeSalaryPOJO> employees = Arrays.asList(
                new EmployeeSalaryPOJO(1, "Alice", 75000),
                new EmployeeSalaryPOJO(2, "Bob", 50000),
                new EmployeeSalaryPOJO(3, "Charlie", 90000),
                new EmployeeSalaryPOJO(4, "David", 120000),
                new EmployeeSalaryPOJO(5, "Eve", 110000)
        );
        List<EmployeeSalaryPOJO> topEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeSalaryPOJO::getSalary).reversed())
                .limit(2)
                .toList();
        System.out.println("Top 2 highest-paid employees:");
        topEmployees.forEach(System.out::println);

        Optional<EmployeeSalaryPOJO> top2ndEmployee = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeSalaryPOJO::getSalary).reversed())
                .skip(1)
                .findFirst();
        top2ndEmployee.ifPresentOrElse(
                employeeSalaryPOJO -> System.out.println("2nd Highest Salary Employee: " + employeeSalaryPOJO),
                () -> System.out.println("No second highest salary employee found")
        );

    }
}
