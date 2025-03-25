package com.mg.problems;

import com.mg.pojo.EmployeeFilter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindEmployeeWithMaxAge {
    public static void main(String[] args) {
        List<com.mg.pojo.EmployeeFilter> employees = Arrays.asList(
                new com.mg.pojo.EmployeeFilter("John", "Male", 35, 38000),
                new com.mg.pojo.EmployeeFilter("David", "Male", 28, 45000),
                new com.mg.pojo.EmployeeFilter("Mike", "Male", 32, 39000),
                new com.mg.pojo.EmployeeFilter("Emma", "Female", 31, 35000),
                new com.mg.pojo.EmployeeFilter("Sophia", "Female", 40, 50000),
                new EmployeeFilter("Tom", "Male", 45, 25000)
        );

        Optional<Integer> maxAge1 = employees.stream()
                .map(EmployeeFilter::getAge)
                .max(Integer::compare);
        System.out.println(maxAge1.orElseThrow());

        OptionalInt maxAge = employees.stream()
                .map(EmployeeFilter::getAge)
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(maxAge.orElseThrow());


    }
}
