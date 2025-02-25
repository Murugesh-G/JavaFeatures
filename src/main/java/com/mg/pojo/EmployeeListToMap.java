package com.mg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class EmployeeListToMap {
    private int id;
    private String name;
    private String department;
    private double salary;
}
