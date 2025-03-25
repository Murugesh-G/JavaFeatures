package com.mg.java8problems;

import com.mg.pojo.EmployeeListToMap;

import java.util.Arrays;
import java.util.List;

public class FindEmpHRDept {
    public static void main(String[] args) {
        List<EmployeeListToMap> employees = Arrays.asList(
                new EmployeeListToMap(101, "John", "IT", 60000),
                new EmployeeListToMap(102, "Emma", "HR", 50000),
                new EmployeeListToMap(103, "Mike", "Finance", 70000),
                new EmployeeListToMap(104, "Sophia", "IT", 65000)
        );

        boolean res = employees.stream()
                .anyMatch(emp -> emp.getDepartment().equals("HR"));
        System.out.println(res);

    }
}
