package com.mg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Notes {
    int id;
    String tagName;
    long tagId;
}
