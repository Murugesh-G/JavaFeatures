package com.mg.problems;

import com.mg.pojo.EmployeeListToMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<EmployeeListToMap> employees = Arrays.asList(
                new EmployeeListToMap(101, "John", "IT", 60000),
                new EmployeeListToMap(102, "Emma", "HR", 50000),
                new EmployeeListToMap(103, "Mike", "Finance", 70000),
                new EmployeeListToMap(104, "Sophia", "IT", 65000)
        );

        double secondHighSalary = employees.stream()
                .mapToDouble(EmployeeListToMap::getSalary)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighSalary);

    }
}
