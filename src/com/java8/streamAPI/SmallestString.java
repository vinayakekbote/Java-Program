package com.java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SmallestString {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Java", "Spring", "Java", "SQL", "Spring", "Docker"
        );

        Optional<String> smallest = names.stream()
                .min(Comparator.comparing(String::length));

        System.out.println("smallest = " + smallest);

    }

}
