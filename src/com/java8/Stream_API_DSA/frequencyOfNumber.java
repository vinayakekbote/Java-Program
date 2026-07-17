package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,6,7,8,5,9,10);

        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println("freq = " + freq);

    }
}
