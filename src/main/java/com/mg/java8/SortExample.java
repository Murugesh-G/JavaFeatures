package com.mg.java8;

import com.mg.problems.pojo.PersonPOJO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "kiwi", "cherry");
        fruits.sort((f1, f2) -> f2.compareTo(f1));
        System.out.println("Sorted fruits (reverse order: )" + fruits);

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println("Sorted numbers: " + sortedNumbers);

        List<String> words = Arrays.asList("banana", "apple", "pear", "kwi");
        List<String> sortedWords = words.stream()
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .toList();
        System.out.println(sortedWords);

        List<PersonPOJO> people = Arrays.asList(
                new PersonPOJO("John", 25),
                new PersonPOJO("Alice", 30),
                new PersonPOJO("Bob", 25),
                new PersonPOJO("Charlie", 35)
        );
        people.sort(Comparator.comparingInt(PersonPOJO::getAge).thenComparing(PersonPOJO::getName));
        System.out.println("Sorted people : " + people);

        List<Integer> numbers2 = Arrays.asList(5, 3, 8, 1, 2, 7, 4);
        List<Integer> sortedNumbers2 = numbers2.parallelStream()
                .sorted()
                .toList();
        System.out.println("Sorted numbers (parallel):" + sortedNumbers2);

        List<Integer> numbers3 = Arrays.asList(5, 3, 8, 1, 2);
        numbers3.sort(Comparator.reverseOrder());
        System.out.println("Sorted numbers in reverse order: " + numbers3);

    }
}
