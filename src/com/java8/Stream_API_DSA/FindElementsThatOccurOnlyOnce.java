package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindElementsThatOccurOnlyOnce {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 40, 20, 50, 30};

        List<Integer> res = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("res = " + res);

    }
}
