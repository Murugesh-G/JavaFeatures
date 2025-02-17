package com.mg.java8;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        /*// Static method reference
        // Using a lambda expression
        Function<Integer, Double> lambdaMethod=(num)-> Math.sqrt(num);
        // Using method reference
        Function<Integer, Double> methodref = Math::sqrt;
        System.out.println(methodref.apply(25));*/

        /*// Instance method reference
        String message = "Hello world";
        // Using a lambda expression
        Supplier<String> lambdaMethod = () -> message.toLowerCase();
        // Using method reference
        Supplier<String> methodRef = message::toLowerCase;
        System.out.println(methodRef.get());*/

        /*// ArbitraryMethodReferenceExample
        List<String> list=List.of("Alice", "Bob", "Charlie");
        // Using a lambda expression
        list.forEach(name -> System.out.println(name));
        // Using method reference
        list.forEach(System.out::println);*/

        /*Supplier<Example> lambdaMethod = () -> new Example();
        Supplier<Example> supplierMethod = Example::new;
        Example obj = supplierMethod.get();*/

        /*// constructor with reference with supplier
        Supplier<String> stringSupplier = String::new;
        String str = stringSupplier.get();
        System.out.println("String length: " + str.length());*/

        /*// constructor reference with parameterized constructors
        Function<String, Person> personFunction = Person::new;
        Person p = personFunction.apply("John");
        System.out.println("Person Name: " + p.name);*/

        /*// constructor reference with multiple parameters
        BiFunction<String,Integer,Employee> employeeBiFunction=Employee::new;
        Employee employee=employeeBiFunction.apply("Murugesh",25);
        System.out.println(employee.name+" "+employee.age);*/

        /*// constructor reference with arrays
        IntFunction<int[]> intFunction = int[]::new;
        int[] array = intFunction.apply(5);
        System.out.println(array.length);*/

        // constructor reference in Streams
        List<String> names = List.of("John", "Jane", "Alice");
        List<User> userList = names.stream().map(User::new).toList();
        userList.forEach(user-> System.out.println("User: "+user.name));
    }
}

class Example {
    public Example() {
        System.out.println("Example Constructor Called!");
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}