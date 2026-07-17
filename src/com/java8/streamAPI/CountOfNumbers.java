package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,5,4,2,6,8);

        num.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
