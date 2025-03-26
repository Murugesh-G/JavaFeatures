package com.mg.java17;

import com.mg.pojo.Employee;

public class SwitchPatternFeature {
    public static void main(String[] args) {

    }

    Object method(Object obj) {
        return switch (obj) {
            case Integer i -> "It is an Integer";
            case String s -> "It is a String";
            case Employee emp when emp.getAddress().equals("KA")-> "KA";
            case null -> "It is null";
            default -> "It is default";
        };
    }
}
