package com.mg.java8problems;

import com.mg.pojo.EmployeeListToMap;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmntHasMoreEmps {
    public static void main(String[] args) {
        List<EmployeeListToMap> employees = Arrays.asList(
                new EmployeeListToMap(101, "John", "IT", 60000),
                new EmployeeListToMap(102, "Emma", "HR", 50000),
                new EmployeeListToMap(103, "Mike", "Finance", 70000),
                new EmployeeListToMap(104, "Sophia", "IT", 65000)
        );

        Optional<Map.Entry<String, Long>> res = employees.stream()
                .collect(Collectors.groupingBy(EmployeeListToMap::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(res.get().getKey() + " : " + res.get().getValue());
    }
}
