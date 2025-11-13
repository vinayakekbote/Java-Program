package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.Comparator;

public class Second_Largest {
    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 89, 3, 2, 6};

        int a=Arrays.stream(arr)
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("not available number"));

        System.out.println(a);
    }
}
