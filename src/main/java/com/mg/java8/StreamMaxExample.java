package com.mg.java8;

import com.mg.pojo.EmployeeFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 8, 2, 1, 6);

        Optional<Integer> maxNum = numbers.stream()
                .max(Integer::compareTo);

        List<EmployeeFilter> employees = Arrays.asList(
                new EmployeeFilter("John", "Male", 35, 38000),
                new EmployeeFilter("David", "Male", 28, 45000),
                new EmployeeFilter("Mike", "Male", 32, 39000),
                new EmployeeFilter("Emma", "Female", 31, 35000),
                new EmployeeFilter("Sophia", "Female", 40, 50000),
                new EmployeeFilter("Tom", "Male", 45, 25000)
        );
        Optional<EmployeeFilter> maxSalaryEmp = employees.stream()
                .max(Comparator.comparingDouble(EmployeeFilter::getSalary));
        System.out.println(maxSalaryEmp);


    }
}
