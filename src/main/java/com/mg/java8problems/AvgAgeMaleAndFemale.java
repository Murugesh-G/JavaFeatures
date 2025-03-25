package com.mg.java8problems;

import com.mg.pojo.EmployeeFilter;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgAgeMaleAndFemale {
    public static void main(String[] args) {
        List<com.mg.pojo.EmployeeFilter> employees = Arrays.asList(
                new com.mg.pojo.EmployeeFilter("John", "Male", 35, 38000),
                new com.mg.pojo.EmployeeFilter("David", "Male", 28, 45000),
                new com.mg.pojo.EmployeeFilter("Mike", "Male", 32, 39000),
                new com.mg.pojo.EmployeeFilter("Emma", "Female", 31, 35000),
                new com.mg.pojo.EmployeeFilter("Sophia", "Female", 40, 50000),
                new EmployeeFilter("Tom", "Male", 45, 25000)
        );

        OptionalDouble maleAvg = employees.stream()
                .filter(emp -> emp.getGender().equals("Male"))
                .mapToInt(EmployeeFilter::getAge)
                .average();
        System.out.println(maleAvg.orElseThrow());

        OptionalDouble femaleAvg = employees.stream()
                .filter(emp -> emp.getGender().equals("Female"))
                .mapToInt(EmployeeFilter::getAge)
                .average();
        System.out.println(femaleAvg.orElseThrow());
    }
}
