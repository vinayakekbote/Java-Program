package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddFilter {
    public static void main(String[] args) {
        Integer num[] = {8,4,6,1,3,4,5,6,7,2,8,9};

        Map<Boolean, List<Integer>> res = Arrays.stream(num)
                .collect(Collectors.partitioningBy(x -> x%2 == 0));

        System.out.println("Even = " + res.get(true));
        System.out.println("Odd = " + res.get(false));

    }
}
