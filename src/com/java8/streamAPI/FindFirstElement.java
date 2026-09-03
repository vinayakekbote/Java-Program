package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50);

        Optional<Integer> res = numbers.stream()
                .findFirst();

        System.out.println("res = " + res);
    }
}
