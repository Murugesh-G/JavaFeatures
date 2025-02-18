package com.mg.java8;

import java.util.Collection;
import java.util.List;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<String> teamIndia = List.of("Virat", "Dhoni", "Jadeja");
        List<String> teamAustralia = List.of("Warner", "Watson", "Smith");
        List<String> teamEngland = List.of("Alex", "Bell", "Broad");
        List<String> teamNewZeland = List.of("Kane", "Nathan", "Vettori");
        List<String> teamSouthAfrica = List.of("AB", "Amla", "Faf");
        List<String> teamWestIndies = List.of("Sammy", "Gayle", "Narine");
        List<String> teamSriLanka = List.of("Mahela", "Sanga", "Dilshan");
        List<String> teamPakistan = List.of("Misbah", "Afridi", "Shehzad");
        List<List<String>> playersInWorldCup2016 = List.of(teamIndia, teamAustralia, teamEngland, teamNewZeland, teamSouthAfrica, teamWestIndies, teamSriLanka, teamPakistan);

        playersInWorldCup2016.stream()
                .flatMap(Collection::stream).toList()
                .forEach(System.out::println);

    }
}
