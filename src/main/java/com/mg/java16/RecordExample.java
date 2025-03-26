package com.mg.java16;

public class RecordExample {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        System.out.println(p1.name());
        System.out.println(p2.age());
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p1.toString());
    }
}

record Person(String name, int age) {
}