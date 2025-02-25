package com.mg.problems;

import com.mg.pojo.EmployeeListToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListEmployeesToMap {
    public static void main(String[] args) {
        List<EmployeeListToMap> employees = Arrays.asList(
                new EmployeeListToMap(101, "John", "IT", 60000),
                new EmployeeListToMap(102, "Emma", "HR", 50000),
                new EmployeeListToMap(103, "Mike", "Finance", 70000),
                new EmployeeListToMap(104, "Sophia", "IT", 65000)
        );

        Map<Integer, EmployeeListToMap> employeeMap = employees.stream()
                .collect(Collectors.toMap(EmployeeListToMap::getId, emp -> emp));

        employeeMap.forEach((id, emp) -> System.out.println(id + " -> " + emp));
    }

}


