package com.mg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class EmployeeSalaryPOJO {
    private int id;
    private String name;
    private double salary;
}
