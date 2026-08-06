package com.java8.streamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple",
                "banana",
                "apple",
                "orange",
                "banana",
                "grapes"
        );

        LinkedHashMap<String, Long> res = list.stream()
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));

        res.entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
