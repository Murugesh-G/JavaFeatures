package com.mg.problems.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeFilter {
    private String name;
    private String gender;
    private int age;
    private double salary;
}
