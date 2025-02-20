package com.mg.java8;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> descendingComparator = (a, b) -> b.compareTo(a);
        TreeMap<Integer, String> treeMap = new TreeMap<>(descendingComparator);
        treeMap.put(101, "Alice");
        treeMap.put(103, "Charlie");
        treeMap.put(102, "Bob");
        treeMap.put(105, "Eve");
        treeMap.put(104, "David");
        System.out.println("TreeMap with custom comparator (Desceding Order):");
        treeMap.forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
