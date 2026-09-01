package com.java8.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateString {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Java", "SQL", "Spring", "Docker");

        Set<String> res = new HashSet<>();

        names.stream()
                .filter(x -> !res.add(x))
                .forEach(System.out::println);


    }
}
