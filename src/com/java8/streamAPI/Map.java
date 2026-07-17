package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,5,4,2,6,8);
        List<Integer> res = num.stream()
                .map(x -> x * x)
                .toList();

        System.out.println("table = " + res);

    }
}
