package com.mg.problems;

import java.util.Objects;

public class Employee {
    private String name;
    private String address;
    private int yob; // Year of birth

    // Constructor
    public Employee(String name, String address, int yob) {
        this.name = name;
        this.address = address;
        this.yob = yob;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yob == employee.yob && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, yob);
    }
    // Getter for yob
    public int getYob() {
        return yob;
    }
}
