package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 1, 5, 8, 9);
        Integer res = arr.stream()
                .max((a,b) -> a.compareTo(b))
                .orElse(0);

        System.out.println("max = " + res);

    }
}
