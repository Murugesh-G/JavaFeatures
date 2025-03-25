package com.mg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
@ToString
public class Employee {
    private String name;
    private String address;
    private int yob; // Year of birth
}
