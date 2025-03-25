package com.mg.java8problems;

import com.mg.pojo.EmployeeFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MostOldEmployee {
    public static void main(String[] args) {
        List<com.mg.pojo.EmployeeFilter> employees = Arrays.asList(
                new com.mg.pojo.EmployeeFilter("John", "Male", 35, 38000),
                new com.mg.pojo.EmployeeFilter("David", "Male", 28, 45000),
                new com.mg.pojo.EmployeeFilter("Mike", "Male", 32, 39000),
                new com.mg.pojo.EmployeeFilter("Emma", "Female", 31, 35000),
                new com.mg.pojo.EmployeeFilter("Sophia", "Female", 40, 50000),
                new EmployeeFilter("Tom", "Male", 45, 25000)
        );

        EmployeeFilter oldEmployee = employees.stream()
                .max(Comparator.comparingInt(EmployeeFilter::getAge))
                .orElse(null);
        System.out.println(oldEmployee);
    }
}
