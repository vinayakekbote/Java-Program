package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> res = arr.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even = " + res.get(true));
        System.out.println("Odd = " + res.get(false));
    }
}
