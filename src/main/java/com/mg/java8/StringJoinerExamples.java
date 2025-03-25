package com.mg.java8;

import java.util.StringJoiner;

public class StringJoinerExamples {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
        stringJoiner.add("Interview");
        stringJoiner.add("Questions");
        stringJoiner.add("Answers");
        System.out.println(stringJoiner);
    }
}
