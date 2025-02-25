package com.mg.problems;

import com.mg.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Varun", "Noida", 2000);
        Employee e2 = new Employee("Divyesh", "Ahmedabad", 2001);
        Employee e3 = new Employee("Ashok", "Noida", 2000);
        Employee e4 = new Employee("XYZ", "GGN", 2002);
        Employee e5 = new Employee("XYZ", "GGN", 2002);


        List<Employee> employees = List.of(e1, e2, e3, e4, e5);

        Map<Integer, Long> employeeCountByYOB = employees.stream().distinct().collect(Collectors.groupingBy(Employee::getYob, Collectors.counting()));
        employeeCountByYOB.forEach((yob,count) -> System.out.println(yob+" - "+count));
    }
}
