package com.mg.problems;

import com.mg.pojo.EmployeeFilters;

import java.util.Arrays;
import java.util.List;

public class RetrieveEmployeesname {
    public static void main(String[] args) {
        List<EmployeeFilters> employees = Arrays.asList(
                new EmployeeFilters("Sophia", "Female", 50000),
                new EmployeeFilters("Steve", "Male", 60000),
                new EmployeeFilters("Sam", "Male", 55000),
                new EmployeeFilters("Emma", "Female", 70000),
                new EmployeeFilters("John", "Male", 65000),
                new EmployeeFilters("Sara", "Female", 58000)
        );

        List<String> empsNames = employees.stream()
                .map(EmployeeFilters::getName)
                .toList();
        System.out.println(empsNames);
    }
}
