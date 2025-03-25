package com.mg.problems;

import com.mg.pojo.EmployeeFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MostYoungEmployee {
    public static void main(String[] args) {
        List<EmployeeFilter> employees = Arrays.asList(
                new EmployeeFilter("John", "Male", 35, 38000),
                new EmployeeFilter("David", "Male", 28, 45000),
                new EmployeeFilter("Mike", "Male", 32, 39000),
                new EmployeeFilter("Emma", "Female", 31, 35000),
                new EmployeeFilter("Sophia", "Female", 40, 50000),
                new EmployeeFilter("Tom", "Male", 45, 25000)
        );

        EmployeeFilter youngEmployee = employees.stream()
                .min(Comparator.comparingInt(EmployeeFilter::getAge))
                .orElse(null);
        System.out.println(youngEmployee);
    }
}
