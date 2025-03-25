package com.mg.problems;

import com.mg.pojo.EmployeeListToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmntAvgSalary {
    public static void main(String[] args) {
        List<EmployeeListToMap> employees = Arrays.asList(
                new EmployeeListToMap(101, "John", "IT", 60000),
                new EmployeeListToMap(102, "Emma", "HR", 50000),
                new EmployeeListToMap(103, "Mike", "Finance", 70000),
                new EmployeeListToMap(104, "Sophia", "IT", 65000)
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(EmployeeListToMap::getDepartment, Collectors.averagingDouble(EmployeeListToMap::getSalary)));
        System.out.println(result);

    }
}
