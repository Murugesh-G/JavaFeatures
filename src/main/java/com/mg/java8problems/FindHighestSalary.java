package com.mg.java8problems;

import com.mg.pojo.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHighestSalary {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Vasu", "HR", 10000),
                new Employee("Abhi", "IT", 15000),
                new Employee("Prakash", "IT", 18000),
                new Employee("Mahesh", "HR", 17500)
        );

        Optional<Employee> res = emps.stream()
                .filter(emp -> emp.getAddress().equals("HR"))
                .max(Comparator.comparingInt(Employee::getYob));
        if (res.isPresent()) {
            System.out.println(res.get());
        } else {
            System.out.println("Not Found");
        }

    }
}
