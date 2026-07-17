package com.java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EndWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Amit",
                "Rahul",
                "Akash",
                "Neha",
                "Ajay",
                "Rohit",
                "Ankit",
                "Priya"
        );

        names.stream()
                .filter(x -> x.toLowerCase().endsWith("t") || x.toLowerCase().startsWith("a"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
