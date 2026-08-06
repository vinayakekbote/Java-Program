package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 1, 5, 8, 9);
        arr.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
