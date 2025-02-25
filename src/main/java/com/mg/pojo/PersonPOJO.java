package com.mg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonPOJO {
    String name;
    int age;

    @Override
    public String toString() {
        return name + " (" + age + ") ";
    }
}
