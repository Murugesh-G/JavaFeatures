package com.mg.problems.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

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
