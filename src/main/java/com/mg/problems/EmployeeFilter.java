package com.mg.problems;

import com.mg.problems.pojo.EmployeeFilters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Java 8+ Program: Filter Employees Whose Names Start with 'S' and Group by Gender to Sum Salaries*/
public class EmployeeFilter {
    public static void main(String[] args) {
        List<EmployeeFilters> employees = Arrays.asList(
                new EmployeeFilters("Sophia", "Female", 50000),
                new EmployeeFilters("Steve", "Male", 60000),
                new EmployeeFilters("Sam", "Male", 55000),
                new EmployeeFilters("Emma", "Female", 70000),
                new EmployeeFilters("John", "Male", 65000),
                new EmployeeFilters("Sara", "Female", 58000)
        );

        Map<String, Double> salarySumByGender = employees.stream()
                .filter(emp -> emp.getName().startsWith("S"))
                .collect(Collectors.groupingBy(
                        EmployeeFilters::getGender,
                        Collectors.summingDouble(EmployeeFilters::getSalary)));

        salarySumByGender.forEach((gender, totalSalary) -> System.out.println(gender + " -> " + totalSalary));
    }
}
