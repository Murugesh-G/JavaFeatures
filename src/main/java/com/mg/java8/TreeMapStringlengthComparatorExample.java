package com.mg.java8;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapStringlengthComparatorExample {
    public static void main(String[] args) {
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        TreeMap<String, Integer> treeMap = new TreeMap<>(lengthComparator);
        treeMap.put("Banana", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Mango", 3);
        treeMap.put("Blueberry", 4);
        treeMap.put("Cherry", 5);
        System.out.println("TreeMap sorted by key length:");
        treeMap.forEach((key, value) -> System.out.println(key + "->" + value));

    }
}
