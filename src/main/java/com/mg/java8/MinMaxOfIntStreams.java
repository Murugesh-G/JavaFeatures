package com.mg.java8;

import java.util.List;
import java.util.IntSummaryStatistics;

public class MinMaxOfIntStreams {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 5, 10, 12, 8, 7, 15);

        IntSummaryStatistics intSummaryStatistics = integerList.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Min : " + intSummaryStatistics.getMin());
        System.out.println("Max : " + intSummaryStatistics.getMax());
    }
}
