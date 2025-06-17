package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        // 1.collect
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));

        // 2.forEach
        list.stream().forEach(x -> System.out.println(x));


    }
}
