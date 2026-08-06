package com.java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SeconHighestSalary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);

        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

    }
}
