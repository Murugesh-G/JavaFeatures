package com.mg.java8problems;

import com.mg.pojo.Notes;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapBasedonDuplicateKeys {
    public static void main(String[] args) {
        List<Notes> notesList = List.of(
                new Notes(1, "note1", 11),
                new Notes(2, "note2", 22),
                new Notes(3, "note3", 33),
                new Notes(4, "note4", 44),
                new Notes(5, "note5", 55),
                new Notes(6, "note4", 66)
        );
        Map<String, Long> notesRecords = notesList.stream()
                .sorted(Comparator
                        .comparingLong(Notes::getTagId)
                        .reversed()) // sorting is based on TagId 55,44,33,22,11
                .collect(Collectors.toMap
                        (Notes::getTagName, Notes::getTagId,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        // consider old value 44 for duplicate key
        // it keeps order
        System.out.println("Notes : " + notesRecords);
    }
}
