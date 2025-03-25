package com.mg.problems;

import java.util.Arrays;

public class LastElementofArray {
    public static void main(String[] args) {
        int[] eles = {34, 21, 76, 56, 45, 19, 9};
        int lastEle = Arrays.stream(eles)
                .skip(eles.length - 1)
                .findFirst()
                .getAsInt();
        System.out.println("Last Element : "+lastEle);
    }
}
