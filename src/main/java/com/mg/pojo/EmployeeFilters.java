package com.mg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmployeeFilters {
    private String name;
    private String gender;
    private double salary;
}
